<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%@include file="headerpage.jsp"%>

    <form action="product" method="post">
      Name of product  <input name="productName"><br>
        <input type="submit">
    </form>
    <hr>
    <a href="product">See my product</a><br>
    <input type="button" value="clickMe" onclick="clickMe()">

<script src="js/myjs.js"></script>
Dimitris
</body>
</html>