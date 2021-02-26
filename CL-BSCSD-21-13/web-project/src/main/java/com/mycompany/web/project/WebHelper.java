/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web.project;

import java.io.IOException;
import java.net.http.HttpResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.websocket.Session;

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
    
     public static user authenticate(String username, String password) {
        user authenticatedUser = null;
        
        //This should loaded from the DB
        user user = new user("admin", "John", "Smith", "admin123");
        
        //Authenticated the users password
        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            authenticatedUser= user;
        }
        
        return authenticatedUser;
    }
    
    
    public static user authenticate(Cookie[] cookies, HttpSession session) {
        // Authenticate the user from cookie session
        user user = null;

        // Iterate all the cookies from the client request
        for (Cookie cookie : cookies) {
            // Checks SESID cookie
            if (cookie.getName().equals("SESID")) {                        
                // Lookup SESID cookie value from sessions
                Object sessionObj = session.getAttribute(cookie.getValue());

                // Load the user from session object if it exists
                if (sessionObj != null) {
                     user = (user)sessionObj;
                }
            }
        }
        return user;
    }
    
    public static void redirectToLogin(HttpServletResponse response) throws IOException{
        response.sendRedirect("login.jsp");
    }
   
}
