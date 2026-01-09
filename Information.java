/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author npjas
 */
public abstract class Information {
    protected String name; // student's name and course name
    protected String code; //can be student id or course code
    
    public Information (String name, String code){
        this.name=name;
        this.code=code;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCode(){
        return code;
    }
    
    public abstract void info();
}
