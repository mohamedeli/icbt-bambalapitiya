/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Mohamed Ali
 */
public class MySQLUtils implements DBUtil {

    @Override
    public void readStudents() {
        System.out.println("Reading students from MSQL DB");
    }

    @Override
    public void addStudents() {
        System.out.println("Add students from MYSQL DB");
    }

    @Override
    public void updateStudents() {
        System.out.println("update students from MSQL DB");
    }

    @Override
    public void deleteStudents() {
        System.out.println("delete student from MYSQL DB");
    }

    @Override
    public void updateStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
