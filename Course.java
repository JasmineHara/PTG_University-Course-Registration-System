/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author npjas
 */
public class Course extends Information{
    private String courseMajorRequirement;
    private int courseYearRequirement;
    private double courseGpaMinRequirement;
    private int Capacity;
    private ArrayList<String> enrolledStudents;
    
    
    public Course (String name,String code,String cmajor,int year, double gpa,int capacity){
        super(name,code);
        this.courseMajorRequirement=cmajor;
        this.courseYearRequirement=year;
        this.courseGpaMinRequirement=gpa;
        this.Capacity= capacity;
        this.enrolledStudents= new ArrayList<>();
    }
    
    public String getCourseMajor(){
        return courseMajorRequirement;
    }
    
    public int getCourseYear(){
        return courseYearRequirement;
    }
    
    public double getCourseGpa(){
        return courseGpaMinRequirement;
    }
    
    public int getCapacity(){
        return Capacity;
    }
    
    public ArrayList<String> getEnrolledStudents() {
        return enrolledStudents;
    }
    
    public void addStudent(String studentName) {
        enrolledStudents.add(studentName);
    }
    
    public int getCurrentEnrollment() {
        return enrolledStudents.size();
    }
    
    
    @Override
    public void info(){
        System.out.println("==Course info==");
        System.out.println("Name: "+name+"\nCourse Code: "+code+"\nRequirements: \n- eligible for "+courseMajorRequirement+" students\n- eligibel for students in year "+courseYearRequirement+"\n- Minimum GPA: "+courseGpaMinRequirement+"\nCource Capacity: "+Capacity);
    }                                                                                                                                        
    
}
