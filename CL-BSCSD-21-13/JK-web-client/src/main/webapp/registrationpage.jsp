<%-- 
    Document   : registrationpage
    Created on : Feb 23, 2021, 10:36:43 PM
    Author     : Mohamed Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <link rel="stylesheet" href="style.css">
    <div class="wrapper fadeInDown">
  <div id="formContent">

    <!-- Icon -->
    <div class="fadeIn first">
        <a class="fadeIn"</> <h1>Create New Branch</h1>
    </div>

    <!-- Registration form -->
    <form>
      <input type="text" id="BID" class="fadeIn second" name="New ID" placeholder="Enter new ID">
      <input type="text" id="BNAME" class="fadeIn second" name="New BID" placeholder="Enter Branch name">
      <input type="text" id="BADDRESS" class="fadeIn second" name="New BADDRESS" placeholder="Enter branch address">
      <input type="text" id="BCONTACT" class="fadeIn second" name="New CONTACT" placeholder="Enter contact number">
      <input type="text" id="BEMAIL" class="fadeIn second" name="New EMAIL" placeholder="Enter email address">
      <input type="password" id="BPASSWORD" class="fadeIn third" name="login" placeholder="Enter new password">
      <input type="submit" class="fadeIn fourth" value="create">
      <input type="button" class="fadeIn fourth" value="GoBack" onclick ="history.back()">
    </form>
    

  </div>
</div>
    </body>
</html>
