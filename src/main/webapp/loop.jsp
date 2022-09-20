<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.io.*,java.util.*"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
int i=1;

%>



<%
response.setIntHeader("Refresh",1);
out.print(i);
i++;
	%>


</body>
</html>