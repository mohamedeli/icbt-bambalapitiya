/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JK.service;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Mohamed Ali
 */ 
@WebService(serviceName = "JKWebService")
public class JKWebService {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hi " + txt + " !!!";
    }
    
     @WebMethod(operationName = "getUser")
    public User getUser(@WebParam(name = "username") String username) {
        User st = Util.getUser(username);
        return st;
    }
    
    @WebMethod(operationName = "getUsers")
    public List<User> getUsers() {
        List<User> users = Util.getUsers();
        return users;
    }
    
    
    @WebMethod(operationName = "addUser")
    public boolean addUser(@WebParam(name = "user") User user) {
        //This should be inserted to DB
        return true;
    }
    
    
    @WebMethod(operationName = "updateUser")
    public boolean updateUser(@WebParam(name = "user") User user) {
        //This should be inserted to DB
        return true;
    }
    
    @WebMethod(operationName = "deleteUser")
    public boolean deleteUser(@WebParam(name = "username") String username) {
        return true;
    }
}
