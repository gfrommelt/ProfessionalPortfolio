<%-- 
    Document   : add
    Created on : Oct 12, 2017, 4:31:55 PM
    Author     : Greg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="externalStylesheet.css">
        <title>Add a New Player</title>
    </head>
    <body>
         <div class="wrap">

            <%@include file="includes/header.jsp" %>
             <%@include file="includes/menu.jsp" %>
        <h1>Add a New Player</h1>
        
        <form name="addForm" action="addPlayer" method="get">
            <label>Player Name:</label>
                <br>
            <input type="text" name="name" value=""/>
                <br>
            <label>Player Number:</label>
                <br><input type="text" name="number" value=""/>
                <br>
            <label>Player Position:</label>
                <br><input type="text" name="position" value=""/>
                <br>
            <label>Player College:</label>
               <br> <input type="text" name="college" value=""/>
                
                <br>
               <br> <input type="submit" name="submit" value="Submit"/>
            
            
        </form>
            
        </div>
        
             
             <%@include file="includes/footer.jsp" %>
        </div>
</body>
</html>
