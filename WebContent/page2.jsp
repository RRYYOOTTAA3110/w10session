<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
response.setHeader("pragma", "no-cache");
response.setHeader("Cache-Control", "no-cache");
response.setDateHeader("Expires", 0);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ページ2</title>
</head>
<body>
<h1>ページ２</h1>
<p>${id}さんはログインしています。</p>
<p><a href="/w10session/page1.jsp">ページ1</a></p>
<p><a href="/w10session/Logout">ログアウト</a></p>
</body>
</html>