<%-- 
    Document   : receivestock
    Created on : Feb 26, 2021, 1:49:05 AM
    Author     : Mohamed Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Received Request</title>
    </head>
    <body>
        <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>Received Request</h1>
    </div>

    <!-- create stock form -->
    <form>
      <input type="text" id="RSID" class="fadeIn second" name="New RSID" placeholder="Enter requested stock ID">
      <input type="text" id="RDATE" class="fadeIn second" name="DATE" placeholder="">
      <input type="text" id="RITEMNAME" class="fadeIn second" name="RITEMNAME" placeholder="">
      <input type="submit" class="fadeIn fourth" value="Search">
      <input type="button" class="fadeIn fourth" value="GoBack" onclick ="history.back()">
    </form>
    </body>
</html>
