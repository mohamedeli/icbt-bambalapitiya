<%-- 
    Document   : requeststock
    Created on : Feb 26, 2021, 2:14:20 AM
    Author     : Mohamed Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Request Stock</title>
    </head>
    <body>
         <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>Request Stock</h1>
    </div>

    <!-- create stock form -->
    <form>
      <input type="text" id="RSID" class="fadeIn second" name="REQUESTSID" placeholder="Enter request stock ID">
      <input type="text" id="RDATE" class="fadeIn second" name="REQUESTDATE" placeholder="Enter date">
      <input type="text" id="RITEMNAME" class="fadeIn second" name="REQUESTITEMNAME" placeholder="Enter item name">
      <input type="text" id="RROUTE" class="fadeIn second" name="REQUESTROUTE" placeholder="Enter route">
      <input type="text" id="RTVEHICLE" class="fadeIn second" name="REQUESTTRANSPORTVEHICLE" placeholder="Enter vehicle type">
      <input type="submit" class="fadeIn fourth" value="Requst">
      <input type="button" class="fadeIn fourth" value="GoBack" onclick ="history.back()">
    </form>
        
    </body>
</html>
