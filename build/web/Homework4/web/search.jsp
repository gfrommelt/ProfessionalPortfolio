<%-- 
    Document   : search
    Created on : Oct 19, 2017, 10:21:03 PM
    Author     : Greg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="externalStylesheet.css">
        <title>Search Players</title>
    </head>
    <body>
         <div class="wrap">

            <%@include file="includes/header.jsp" %>
             <%@include file="includes/menu.jsp" %>
        <h1>Search Players</h1>
        
        <form name="searchForm" action="search" method="get">
            
            <input type="text" name="searchVal" value=""/>
            <br>
            <input type="submit" name="submit" value="Search"/>
            
        </form>
        </div>
        
             
             <%@include file="includes/footer.jsp" %>
        </div>
</body>
</html>
