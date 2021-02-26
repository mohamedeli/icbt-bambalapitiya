<%-- 
    Document   : totalsales
    Created on : Feb 26, 2021, 1:51:19 AM
    Author     : Mohamed Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Total Sales</title>
    </head>
    <body>
       <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>Total Sales</h1>
    </div>

    <!-- create stock form -->
    <form>
      <input type="text" id="TSID" class="fadeIn second" name="IID" placeholder="Enter Sales ID">
      <input type="text" id="TSALES" class="fadeIn second" name="ITEMNAME" placeholder="">
      <input type="text" id="TSDATE" class="fadeIn second" name="IQUNATITY" placeholder="">
      <input type="submit" class="fadeIn fourth" value="Total">
      <input type="button" class="fadeIn fourth" value="GoBack" onclick ="history.back()">
    </form>
    </body>
</html>
