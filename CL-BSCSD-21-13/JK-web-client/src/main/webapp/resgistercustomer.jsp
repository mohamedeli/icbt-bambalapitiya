<%-- 
    Document   : resgistercustomer
    Created on : Feb 26, 2021, 2:13:57 AM
    Author     : Mohamed Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Registration</title>
    </head>
    <body>
        <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>Customer Registration</h1>
    </div>

    <!-- Registration form -->
    <form>
      <input type="text" id="CID" class="fadeIn second" name="CUSTOMERID" placeholder="Enter new Customer ID">
      <input type="text" id="CNAME" class="fadeIn second" name="CUSTOMERNAME" placeholder="Enter name">
      <input type="text" id="CADDRESS" class="fadeIn second" name="CUSTOMERADDRESS" placeholder="Enter address">
      <input type="text" id="BCONTACT" class="fadeIn second" name="CUSTOMERCONTACT" placeholder="Enter contact number">
      <input type="submit" class="fadeIn fourth" value="Register">
      <input type="button" class="fadeIn fourth" value="GoBack" onclick ="history.back()">
    </form>
    
    </body>
</html>
