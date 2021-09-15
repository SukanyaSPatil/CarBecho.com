<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}


th, td {
	padding: 15px;
	text-align: left;
}
</style>
</head>
<body>
<form action="DeleteD.xyz">
Are You really Want to Remove The Car:<br>
	<%
HttpSession session1=request.getSession();
		String chasisNo=(String)request.getAttribute("chasisNo");
session1.setAttribute("chasisNo", chasisNo); %>
<input type="submit" value="YES" class="button" style=" width : 89px;"><br>
<a href="DealerHome.jsp" class="button">No</a>
</form>
</body>
</html>