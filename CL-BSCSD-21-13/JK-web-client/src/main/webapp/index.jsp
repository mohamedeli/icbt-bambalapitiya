<%-- 
    Document   : index
    Created on : Feb 21, 2021, 3:25:34 AM
    Author     : Mohamed Ali
--%>

<%@page import="com.mysql.cj.core.util.Util"%>
<%@page import="java.util.List"%>
<%@page import="jk.service.User"%>
<%@page import="jk.service.JKWebService"%>
<%@page import="jk.service.JKWebService_Service"%>
<%@page import="java.util.Map.Entry"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    
    
    <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>JK Sales System</h1>
    </div>

    <!-- Login Form -->
    <form action="home.jsp" method="post">
      <input type="text" id="login" class="fadeIn second" name="login" placeholder="login">
      <input type="password" id="password" class="fadeIn third" name="login" placeholder="password">
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form> 

  </div>
        <div><%
            
        JKWebService_Service client = new JKWebService_Service();
        JKWebService proxy = client.getJKWebServicePort();
        
        
          
            
            //String txt = proxy.hello("Geroge");
            //out.print(txt);
              
    %></div>
</div>
   
    </body>

