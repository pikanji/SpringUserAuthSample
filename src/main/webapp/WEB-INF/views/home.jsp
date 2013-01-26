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

<p><a href="<c:url value='/login' />">Login</a></p>

<p><a href="<c:url value='/signup' />">Sign up</a></p>

<c:if test="${not empty userName}">
	<p>Logged in as: ${userName}</p>
	<p><a href="<c:url value='j_spring_security_logout' />">Logout</a></p>
</c:if>

</body>
</html>
