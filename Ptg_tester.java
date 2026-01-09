/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author npjas
 */
public class Ptg_tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create registration system with max capacity of 2
        Registration registration = new Registration(2);
        
        //create courses with capacity of 2
        Course cs101 = new Course("Introduction to Programming", "CS101", "Computer Science", 1, 2.5, 2);
        Course cs201 = new Course("Data Structures", "CS201", "Computer Science", 2, 3.0, 2);
        Course math101 = new Course("Calculus I", "MATH101", "Mathematics", 1, 2.0, 2);
        
        //display courses available
        cs101.info();
        cs201.info();
        math101.info();
        
        //add courses to registration system
        registration.addCourse(cs101);
        registration.addCourse(cs201);
        registration.addCourse(math101);
        
        //create students
        Student student1 = new Student("Gojo Satoru", "S001", "Computer Science", 1, 3.5, "Introduction to Programming");
        Student student2 = new Student("Idia Shroud", "S002", "Computer Science", 2, 3.8, "Introduction to Programming");
        Student student3 = new Student("Yona", "S003", "Computer Science", 1, 3.2, "Introduction to Programming");
        Student student4 = new Student("Syahroni", "S004", "Mathematics", 1, 2.3, "Introduction to Programming");
        Student student5 = new Student("Xia Yizhou", "S005", "Computer Science", 1, 2.0, "Introduction to Programming");
        
        //display courses available
        System.out.println("=== Student Information ===\n");
        student1.info();
        System.out.println();
        student2.info();
        System.out.println();
        student3.info();
        System.out.println();
        student4.info();
        System.out.println();
        student5.info();
        System.out.println();
        
        //test registration
        System.out.println("=== Testing Student Registration ===\n");
        
        registration.addStudent(student1); // Should succeed
        registration.addStudent(student2); // Should succeed
        registration.addStudent(student3); // Should fail - course full
        registration.addStudent(student4); // Should fail - wrong major
        registration.addStudent(student5); // Should fail - low GPA
        
        // display students in course
        registration.displayStudentsInCourse("Introduction to Programming");
    }
}
