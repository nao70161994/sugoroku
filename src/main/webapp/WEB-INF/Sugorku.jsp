<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Sugoroku.css">
<title>超双六</title>
<style type="text/css">
h1{
	color: red;
}

.gamebord{
	font-family: monospace;
}
</style>
</head>

<body>
<h1>超双六</h1>


<form action="SugorokuServlet" method="POST">
<input type="submit" value="サイコロを振る">
</form>
<form action="SugorokuServlet" method="GET">
<input type="submit" value="リスタート">
</form>


<div class= "gamebord">
 <%= request.getAttribute("foo") %><br>
スロロロロロロロロロロロロロロロロロロロゴ<br>
</div>




</body>
</html>