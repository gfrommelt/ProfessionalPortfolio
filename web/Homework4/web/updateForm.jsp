<%-- 
    Document   : updateForm
    Created on : Oct 16, 2017, 2:42:15 PM
    Author     : Greg
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Players"%>
<% Players player = (Players) request.getAttribute("player"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="externalStylesheet.css">
        <title>Update a Player</title>
    </head>
    <title>Update a Player</title>
    </head>
    <body>
         <div class="wrap">

            <%@include file="includes/header.jsp" %>
             <%@include file="includes/menu.jsp" %>
        <h1>Update a Player</h1>
        
        <form name="updateForm" action="updatePlayer" method="get">
            <label>User Email:</label>
                <br>
            <input type="text" name="id" value="<%= user.getEmail() %>" readonly />
                <br>
            
               <label>User Name:</label>
                <br>
            <input type="text" name="name" value=""/>
                <br>
            <label>First Name:</label>
                <br><input type="text" name="firstName" value=""/>
                <br>
            <label>Last Name:</label>
                <br><input type="text" name="lastName" value=""/>
                <br>
            <label>Email:</label>
               <br> <input type="text" name="email" value=""/>
                 <br>
            <label>Password:</label>
               <br> <input type="text" name="password" value=""/>
                
                <br>
               
               <br> <input type="submit" name="submit" value="Update"/>
            <br> <input type="reset" name="reset" value="Clear"/>
            
        </form>
            
        </div>
        
             
             <%@include file="includes/footer.jsp" %>
        </div>
</body>
</html>
