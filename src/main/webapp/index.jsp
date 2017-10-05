<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %> 
    <%@ page import="java.io.*,java.util.*" %>
    
<html>
<head><title>Welcome</title></head>
<body>
<%
response.sendRedirect("welcome");
%>
</body>
</html>
