<%-- 
    Document   : profile
    Created on : Dec 29, 2020, 7:57:25 PM
    Author     : Mohamed Ali
--%>

<%@page import="com.mycompany.web.project.WebHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        <%
            if (WebHelper.authenticate(request.getCookies(), session) == null) {
                WebHelper.redirectToLogin(response);
            }
            %>
    </body>
</html>
