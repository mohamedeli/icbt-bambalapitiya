/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web.project;

/**
 *
 * @author Mohamed Ali
 */
public class WebHelper {
    
    public static Student[] getStudent() {
        
        Student [] students = new Student[3];
        
        students[0] = new Student("ST001", "John", "123V");
        students[1] = new Student("ST002", "George", "456V");
        students[2] = new Student("ST002", "James", "789V"); 
        
        return students;
    }
    
    public static String getgreeting(){
        String name = "Geroge";
        String greeting = "Hello";
        return greeting + " " + name;
    }
    
}
