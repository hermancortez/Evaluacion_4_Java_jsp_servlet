<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<!-- <a class="navbar-brand" href="#">Menú</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>  -->
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="UsuarioController">Home</a></li>
						<li class="nav-item">
							<a class="nav-link active" href="UsuarioCrearController">Nuevo Usuario</a>
						</li>
						<li class="nav-item">
							<a class="nav-link active" href="UsuarioDetalleController">Editar Usuario</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
			
		<p>Nombres<c:out value="${usuario.getNombres()}"></c:out></p>
		<p>Apellidos<c:out value="${usuario.getApellidos()}"></c:out></p>
		<p>Fecha de Nacimiento<c:out value="${usuario.getFecha_nac()}"></c:out></p>
		<p>Tipo de usuario<c:out value="${usuario.getTipo_usuario()}"></c:out></p>
		
		<p><a href="UsuarioController">Volver</a></p>
	</div>

</body>
</html>