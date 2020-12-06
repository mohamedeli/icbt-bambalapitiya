/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import db.DBUtil;
import db.MySQLUtils;
/**
 *
 * @author Mohamed Ali
 */
public class App {
    public static void main (String [] args){
        DBUtil utl = new MySQLUtils();
        
        process p1 = new process();
        p1.process(utl);
    }
    
}
