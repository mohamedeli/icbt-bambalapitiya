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
public class OracleUtil implements DBUtil {
    @Override
    public void readStudents() {
        System.out.println("Reading students from Oracle");
    }

    @Override
    public void addStudents() {
        System.out.println("Add students from Oracle");
    }

    @Override
    public void updateStudents() {
        System.out.println("update students from Oracle");
    }

    @Override
    public void deleteStudents() {
        System.out.println("delete student from Oracle");
    }

    @Override
    public void updateStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
