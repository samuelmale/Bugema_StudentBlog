<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %> 
    <%@ page import="java.util.ArrayList"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Blog</title>
</head>
<body>
<style type="text/css">
  <%@include file="css/menu.css" %>
</style>
<div id="wrapper">
<div id="header">
<jsp:include page="header.jsp" />
</div><br>
<div id="body3">
<div id="form-container">
<div id="form">
<div id="profile">
<div id="userIcon" >
<img class="h"alt="User Icon" src="${pageContext.request.contextPath}/resources/images/user.jpg"/ height="100px">
</div>
<ul>
<li>User's Name</li>
<li>Ask Question</li>
<li>Answer Questions</li>
</ul>
</div>
</div>
</div>
<div id="content"><br><br>     
   <c:forEach  items="${posts}"  var="post">
   <hr>
   <br>
   <div id="posterProfile">
  <ul> <li><img class="h"alt="User Icon" src="${pageContext.request.contextPath}/resources/images/user.jpg"/ height="50px"></li>
  <li><b><div id="UserName"><c:out value = "${post.author.userName}"/></div></b></li><div id="date">
  <li><b><i><c:out value = "${post.date}"/></i></b></div></ul>
  </div>
   <br>
   <div id="post">
   
   
   <h3><b><i>${post.title }</i></b></h3>
<article>  <c:out value = "${post.body}"/></article>
<br><br>
</div>
   <br><br><br>


</c:forEach>   
</div>
</div>
<div id="footer">
<jsp:include page="footer.jsp" />
</div>
</div>
</body>
</html>