<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p><a href="<c:url value='/spring_security_login' />">Login</a></p>

<p><a href="<c:url value='/signup' />">Sign up</a></p>

<c:if test="${not empty userName}">
	<p>Logged in as: ${userName}</p>
</c:if>

</body>
</html>
