<%-- 
    Document   : login
    Created on : Dec 29, 2020, 9:08:07 AM
    Author     : Mohamed Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="home.jsp" method="post">
            
            <label for="username">Username:</label><br>
            <input type="text" id="lusername" name="username" value=""><br>
            
            
            <label for="password">Password:</label><br>
            <input type="password" id="lpassword" name="password" value=""><br><br>
            
            <input type="submit" value="Login">
        </form>
    </body>
</html>
