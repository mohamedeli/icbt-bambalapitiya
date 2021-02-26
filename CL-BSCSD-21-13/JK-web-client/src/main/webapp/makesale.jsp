<%-- 
    Document   : makesale
    Created on : Feb 26, 2021, 2:19:43 AM
    Author     : Mohamed Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Make Sale</title>
    </head>
    <body>
          <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>Make Sale</h1>
    </div>

    <!-- create stock form -->
    <form>
      <input type="text" id="SIID" class="fadeIn second" name="SALESITEMID" placeholder="Enter Item ID">
      <input type="text" id="SIName" class="fadeIn second" name="SALESITEMNAME" placeholder="Enter Item name">
      <input type="text" id="SIQuantity" class="fadeIn second" name="SALESITEMQUNATITY" placeholder="Enter quantity">
      <input type="text" id="SIAMOUNT" class="fadeIn second" name="SIAMOUNT" placeholder="Enter amount"> 
      <input type="submit" class="fadeIn fourth" value="create">
      <input type="button" class="fadeIn fourth" value="GoBack" onclick ="history.back()">
    </form>
    </body>
</html>
