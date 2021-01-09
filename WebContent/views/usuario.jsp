<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalle de Usuarios</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h1>Detalle de Usuario</h1>

		<p>Nombres<c:out value="${usuario.getNombres()}"></c:out></p>
		<p>Apellidos<c:out value="${usuario.getApellidos()}"></c:out></p>
		<p>Fecha de Nacimiento<c:out value="${usuario.getFecha_nac()}"></c:out></p>
		<p>Tipo de usuario<c:out value="${usuario.getTipo_usuario()}"></c:out></p>
		
		<p><a href="${pageContext.servletContext.contextPath}/">Volver</a></p>
	</div>

</body>
</html>