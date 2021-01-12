<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevo Usuario</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Crear nuevo Usuario</h1>
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
							<a class="nav-link" aria-current="page" href="UsuarioController">Listado de Usuarios</a></li>
						<li class="nav-item">
							<a class="nav-link active" href="UsuarioCrearController">Nuevo Usuario</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
		<form action="UsuarioCrearController" method="POST">
			<div class="mb-3">
				<label for="id" class="form-label">ID</label> 
				<input type="number" class="form-control" id="id" name="id" placeholder="numero">
			</div>
			<div class="mb-3">
				<label for="nombres" class="form-label">Nombres</label> 
				<input type="text" class="form-control" id="nombres" name="nombres" placeholder="Nombres">
			</div>
			<div class="mb-3">
				<label for="apellidos" class="form-label">Apellidos</label> 
				<input type="text" class="form-control" id="apellidos" name="apellidos" placeholder="Apellidos">
			</div>
			<div class="mb-3">
				<label for="fecha_nac" class="form-label">Fecha Nacimiento</label> 
				<input type="text" class="form-control" id="fecha_nac" name="fecha_nac" placeholder="ingrese fecha de nacimiento">
			</div>
			<div class="mb-3">
				<label for="tipo_usuario" class="form-label">Tipo de Usuario</label> 
						 <select name="tipo_usuario">
						 	<option value="sin">Seleccionar</option>
						    <option value="Administrativo">Administrador</option>
						    <option value="Cliente">Cliente</option>
						    <option value="Profesional">Profesional</option>
						  </select>
			</div>			
			 <div class="col-12">
    			
    			<a class="nav-link active" href="UsuarioController"><button type="submit" class="btn btn-primary">Crear</button></a>
  			</div>
		</form>
	</div>
</body>
</html>