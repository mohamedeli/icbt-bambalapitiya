package jk.webclient;


import java.io.IOException;
import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jk.service.JKWebService;
import jk.service.JKWebService_Service;
import jk.service.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Ali
 */
public class WebHelper {
    /*public static List<Student> getStudents() {
        JKWebService_Service client = new JKWebService_Service();
        JKWebService proxy = client.getJKWebServicePort();
        List<Student> list = proxy.getStudents();
        return list;
    }*/
    
    public static User authenticate(String username, String password) {
        User authenticatedUser = null;
        
        JKWebService_Service client = new JKWebService_Service();
        JKWebService proxy = client.getJKWebServicePort();
        User user = proxy.getUser(username);
        
        //Authenticated the users password
        if (user != null && password.equals(user.getPassword())) {
            authenticatedUser= user;
        }
        
        return authenticatedUser;
    }
    
    
    public static User authenticate(Cookie[] cookies, HttpSession session) {
        // Authenticate the user from cookie session
        User user = null;

        // Iterate all the cookies from the client request
        for (Cookie cookie : cookies) {
            // Checks SESID cookie
            if (cookie.getName().equals("SESID")) {                        
                // Lookup SESID cookie value from sessions
                Object sessionObj = session.getAttribute(cookie.getValue());

                // Load the user from session object if it exists
                if (sessionObj != null) {
                     user = (User)sessionObj;
                }
            }
        }
        return user;
    }
    
    public static void redirectToLogin(HttpServletResponse response) throws IOException{
        response.sendRedirect("index.jsp");
    }
    
}
