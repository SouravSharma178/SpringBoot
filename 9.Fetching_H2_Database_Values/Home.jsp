<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<form action="addAlien">
<input type="text" name="aid">
<br>
<input type="text" name="aname">
<br>
<input type="submit">
</form>

<p>Search by Id</p>
<form action="getAlien">
<input type="text" name="aid">
<input type="submit">
</form>
</body>
</html>
