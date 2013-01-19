<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Sign up</title>
</head>
<body>
<h1>Sign up</h1>
<p>
	<form:form method="POST" commandName="user" modelAttribute="user" id="signup">
		<form:label path="userName">User Name</form:label>
		<form:input path="userName" required="true" /><br/>
		
		<form:label path="password">Password</form:label>
		<form:input type="password" path="password" required="true" /><br/>
		
		<input type="submit" value="SignUp"/>
	</form:form>
</p>
</body>
</html>

