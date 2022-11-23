<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><% out.print("Hello World to All Advantagers");  %>
</h1>

<br/>
<form action="product" method="post">
  Name of product  <input name="productName"><br>
    <input type="submit">

</form>
<hr>
<a href="product">See my product</a>
</body>
</html>