<%-- 
    Document   : tranportroute
    Created on : Feb 26, 2021, 1:51:59 AM
    Author     : Mohamed Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transport Route</title>
    </head>
    <body>
        <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>Transport Route</h1>
    </div>

    <!-- create stock form -->
    <form>
      <input type="text" id="TSRID" class="fadeIn second" name="STOCKREQUESTID" placeholder="Enter Stock request ID">
      <input type="text" id="SRDATE" class="fadeIn second" name="STOCKREQUESTDATE" placeholder="">
      <input type="text" id="SRQNAME" class="fadeIn second" name="STOCKREQUESNAME" placeholder="">
      <input type="text" id="SRQUANTIY" class="fadeIn second" name="STOCKREQUESTQUNATITY" placeholder="">
      <input type="submit" class="fadeIn fourth" value="Search">
      <input type="button" class="fadeIn fourth" value="GoBack" onclick ="history.back()">
    </form>
    </body>
</html>
