/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author npjas
 */
public class Student extends Information {
    private String major;
    private int year;
    private double gpa;
    private String pickedCourse;
    
    public Student(String name,String code,String major, int year, double gpa,String course){
        super(name,code);
        this.major=major;
        this.year=year;
        this.gpa=gpa;
        this.pickedCourse= course;
    }
    
    
    public String getMajor(){
        return major;
    }
    
    public int getYear(){
        return year;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public String getPickedCourse(){
        return pickedCourse;
    }
    
    @Override
    public void info(){
        System.out.println("==Student info==");
        System.out.println("Name: "+name+"\nStudent ID: "+code+"\nMajor: "+major+"\nYear: "+year+"\nGPA: "+gpa+"\nCourses picked: "+pickedCourse);
    }
}
