
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author npjas
 */
public class Registration {
   private ArrayList<Student> studentsinThisCourse; 
   private ArrayList<Course> allCourse; 
   private int maxStudentPerCourse;
   
   public Registration(int max){
       this.studentsinThisCourse= new ArrayList<>();
       this.allCourse= new ArrayList<>();
       this.maxStudentPerCourse= max;
   }
   
   public void addCourse(Course course){ //adds the courses into a arrayl;ist
       allCourse.add(course);
   }
   
   public boolean checkStudent(Student student){
       String coursePick = student.getPickedCourse();
       Course selectedCourse=null;
       
       for (Course course: allCourse){
           if (course.getName().equals(coursePick)){
               selectedCourse= course;
               break;
           }
       }
       
       //if course is not found
       if (selectedCourse == null){
            System.out.println("This course is not found");
            return false;
       }
       
       //if selected course is full
       if (selectedCourse.getCurrentEnrollment() >= selectedCourse.getCapacity()){
           System.out.println("This course is full");
           return false;
       }
       
       //check for students requirements
       boolean majorReq= student.getMajor().equals(selectedCourse.getCourseMajor());
       boolean yearReq= student.getYear() == selectedCourse.getCourseYear();
       boolean gpaReq= student.getGpa() >= selectedCourse.getCourseGpa();
       
       if (!majorReq || !yearReq || !gpaReq){
           System.out.println(student.getName()+", You are not qualified for this course, sorry :P");
           return false;
       }
       return true;
   }
   
   public void addStudent(Student student){
       if (checkStudent(student)){
           String coursePick=student.getPickedCourse();
       
       for (Course course:allCourse){
           if (course.getName().equals(coursePick)){
               course.addStudent(student.getName());
               System.out.println(student.getName() + " has been successfully registered for " + course.getName());
               break;
           }
       }
       }
   }
   
   public void displayStudentsInCourse(String coursePick){
       Course selectedCourse=null;
       
       //find the course
       for (Course course : allCourse){
           if (course.getName().equals(coursePick)){
               selectedCourse=course;
               break;
           }
       }
       
       if (selectedCourse==null){
           System.out.println("Course not found");
           return;
       }
       
       System.out.println("\n==Students enrolled in "+selectedCourse.getName()+"==");
       System.out.println("Course Name: " +coursePick);
       System.out.println("Enrolled: " +selectedCourse.getCurrentEnrollment()+"/"+selectedCourse.getCapacity());
       
       if (selectedCourse.getEnrolledStudents().isEmpty()) {
            System.out.println("No students enrolled yet. :C");
            
        } else {
            System.out.println("Students in"+coursePick+":");
            for (int i = 0; i <selectedCourse.getEnrolledStudents().size();i++) {
                System.out.println((i+1) +". "+ selectedCourse.getEnrolledStudents().get(i));
            }
        }
    }
}