<%-- 
    Document   : logout
    Created on : 5 May, 2020, 4:00:52 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            request.logout();
            response.sendRedirect("index.xhtml");
            
            
            %>
    </body>
</html>
