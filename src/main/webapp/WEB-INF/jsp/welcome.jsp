<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %> 
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Blog</title>

<script type="text/javascript">
function validateForm()
{
	var check = false;
  var form= document.getElementById("registerForm");
  var firstName=form.userName.value;
  var lastName=form.lastName.value;
  
	
	if(firstName!=null&&firstName!=""&&lastName!=null&&firstName!=""&&password!=null&&password!="")
		{
		check=true;
		//return true;
		}
	else {
			alert("Cann't accept empty fields!");
			check=false;
		
	}
	if(check){
		check = comfirmPassWord();
		  if(!check)
		  {
			alert("Passwords don't match");
			check=false;
			
		  }
	}
return check;
	
	
}
function comfirmPassWord() {
	var flag = false;
var form = document.getElementById("registerForm");
var pass1 = form.password.value;
var pass2 = form.comfirmPassword.value; 
if(pass1==pass2){
	flag=true;
}
return flag;
}
</script>

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
<form name="registerForm" action="" method="post">
<i id="reg-head"><b>Login Here</i></b><br><br>
<label id="formlabel">Username:</label><input type="text" class="text" placeHolder="Enter your Name" required><br><br>
<label id="formlabel">Password:</label><input type="text" class="text" placeHolder="Enter Password" required><br><br>
<input type="submit" id="submit1" class="submit"value="Login"><br><br>
<hr>
</form>

 <div id="register"> 
<form:form method="Post" id="registerForm" modelAttribute="user" action="registration" onsubmit="return validateForm()">
<b><i id="reg-head">Register for a new account</i></b><br><br>
<label >First name:</label><form:input path="userName" class="reg" type="text"  placeHolder="First name" /><br><br>
<label>Last name:</label><form:input path="lastName" class="reg" type="text"  placeHolder="Last name" /><br><br>
<label> Password:</label><form:input path="password" class="reg" type="text"  placeHolder="Create password" /><br><br>
<label> Comfirm:</label><form:input path="comfirmPassword" class="reg" type="text"  placeHolder="Comfirm password" /><br><br>
<input type="submit" id="submit2" value="Register" class="submit">

</form:form>
</div>

</div>
</div>
<div id="content"><br><br>     
  <div id="welcomemessage">
   <h2>Hey your welcome to smart bloggers.</h2>
<article>You can nab yourself a new account 
free. Post and make your blogs, chat and 
ask questions with friends. For Newbie 
programmers, this is for you.</article>	
  
</div>
<div id="welcomeImage">
<img class="hackerImage"alt="User Icon" src="${pageContext.request.contextPath}/resources/images/hacker.jpg"/>
</div>
</div>
<div id="footer">
<jsp:include page="footer.jsp" />
</div>
</div>
</body>
</html>