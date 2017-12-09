
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" type="text/css" href="externalStylesheet.css">
        <title>JSP Page</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    <body>
           <div class="wrap">

            <%@include file="includes/header.jsp" %>
             <%@include file="includes/menu.jsp" %>
        <h1>The Green Bay Packers</h1>
        <%= table %>
        
    
    </div>
        
             
             <%@include file="includes/footer.jsp" %>
        </div>
</body>
</html>
