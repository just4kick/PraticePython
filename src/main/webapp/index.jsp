<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Session demo page</h1>
<form action="index.jsp" method="post">
enter key
<input type = "text" name="key">
<%
String key=request.getParameter("key");
if(request.getMethod().equals("POST"))
{
	if(session.getAttribute(key)==null)
	{
		out.print("need to register");
	}
	else
	{
		response.sendRedirect("home.jsp");
	}
	
}




%>
<input type = "submit">
</form><br><br>

ARE YOU NEW HERE! Register below<br><br>
<form action="register">
enter key
<input type = "text" name="key">
enter value
<input type = "text" name="value">
<input type = "submit">
</form>



</body>
</html>