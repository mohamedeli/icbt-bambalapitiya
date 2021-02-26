<%-- 
    Document   : createstock
    Created on : Feb 23, 2021, 10:57:16 PM
    Author     : Mohamed Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create New Stock</title>
    </head>
    <body>
        <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>Create New Stock</h1>
    </div>

    <!-- create stock form -->
    <form>
      <input type="text" id="SID" class="fadeIn second" name="New SID" placeholder="Enter stock ID">
      <input type="text" id="ITEMID" class="fadeIn second" name="New BID" placeholder="Enter item ID">
      <input type="text" id="ITEMNAME" class="fadeIn second" name="New ITEMNAME" placeholder="Enter new item name">
      <input type="text" id="SITEMPRICE" class="fadeIn second" name="New ITEMPRICE" placeholder="Enter item price">
      <input type="text" id="SITEMQUANTITY" class="fadeIn second" name="New ITEMQUANTITY" placeholder="Enter item quantity">
      <input type="text" id="SCREATEDATE" class="fadeIn third" name="STOCK DATE" placeholder="Enter stock create date">
      <input type="submit" class="fadeIn fourth" value="create">
      <input type="button" class="fadeIn fourth" value="GoBack" onclick ="history.back()">
    </form>

  </div>
</div>
    </body>
</html>
