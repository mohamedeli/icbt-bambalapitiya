/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import db.DBUtil;

/**
 *
 * @author Mohamed Ali
 */
public class process {
    public void process(DBUtil util){
        util.addStudents();
        util.updateStudent();       
    }
    
    
}
