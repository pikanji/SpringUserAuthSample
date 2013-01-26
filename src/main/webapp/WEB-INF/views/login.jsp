<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login</title>
</head>
<body>
<h1>My Login Page</h1>

<form action="<c:url value='j_spring_security_check' />" method="POST">

	<label>User Name : </label>
	<input type="text" name="j_username" value="" />
	<br />
	<label>Password: </label>
	<input type="password" name="j_password" value="" />
	<br />
	<input type="submit" value="Login" />

</form>

</body>
</html>
