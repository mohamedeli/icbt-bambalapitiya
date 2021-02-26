<%-- 
    Document   : home
    Created on : Feb 26, 2021, 1:20:14 AM
    Author     : Mohamed Ali
--%>
<%@page import="java.util.UUID"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Branch Home</title>
    </head>
    <body>
        
        <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>Branch Home</h1>
        <button onclick="document.location='makesale.jsp'">Make Sale</button>
        <button onclick="document.location='requeststock.jsp'">Request Stock</button>
        <button onclick="document.location='receivestock.jsp'">Received Request</button>
        <button onclick="document.location='totalsales.jsp'">Total Sales</button>
        <button onclick="document.location='transportroute.jsp'">Transport Route</button>
        <button onclick="document.location='resgistercustomer.jsp'">Register Customer</button>
    </div>
         User user = WebHelper.authenticate(request.getCookies(), session);
            
            if (user == null) {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
            
            
                if (username != null && password != null) {
                    
                    user = WebHelper.authenticate(username, password);
                    if (user != null) {
                        String sessionId = UUID.randomUUID().toString().replace("-", "").toUpperCase();
                        // Create cookie and attach it to response
                        Cookie cookie = new Cookie("SESID", sessionId);
                        response.addCookie(cookie);
                        // Create session attribute
                        session.setAttribute(sessionId, user);
                        out.print("Welcome " + user.username());
                    } else {
                        WebHelper.redirectToLogin(response);
                    }
                } else {
                    WebHelper.redirectToLogin(response);
                }
            } else {
                out.print("Welcome " + user.username());
    </body>
</html>
