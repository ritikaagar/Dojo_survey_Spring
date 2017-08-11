 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Dojo Survey</title>
</head>

<body>
	<h1>Dojo Survey</h1>
	<form action = "/result" method = "POST">
		<p>
			Name: <input type = "text" name = "name">
		</p>
		<p>
			Dojo Location: <input type = "text" name = "location">
		</p>
		<p>
			Favorite Language: <input type = "text" name = "language">
		</p>
		<p>
			Comment: <input type = "textarea" name = "comment">
		</p>
		<p>
			<input type = "submit" value = "Submit">
		</p>
	</form>
</body>
</html>