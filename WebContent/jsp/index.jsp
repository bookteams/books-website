<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
这是我的主界面
<%=request.getAttribute("hello") %>

<%=request.getAttribute("jsonObject") %>

</body>
</html>