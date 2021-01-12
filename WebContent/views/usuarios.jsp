<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Usuarios</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Listado de Usuarios</h1>

		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Menú</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
				
					<ul class="navbar-nav">
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="Home">Home</a></li>
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="Crearcapacitacion">Crear capacitación</a></li>
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="Listar">Listado capacitaciones</a></li>
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="Login">Ingresa a tu cuenta</a></li>
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="CerrarSesion">Cerrar Sesión</a></li>
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="UsuarioController">Listado de Usuarios</a></li>
						<li class="nav-item">
							<a class="nav-link active" href="UsuarioCrearController">Registro de Usuario</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>			
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombres</th>
					<th scope="col">Apellidos</th>
					<th scope="col">Fecha Nacimiento</th>
					<th scope="col">Tipo de Usuario</th>
					<th scope="col">Accion</th>
			</thead>
			<tbody>
				<c:forEach var="c" items="${usuario}">
					<tr>
						<td><c:out value="${c.getId_reg()}"></c:out></td>
						<td><c:out value="${c.getNombres()}"></c:out></td>
						<td><c:out value="${c.getApellidos()}"></c:out></td>
						<td><c:out value="${c.getFecha_nac()}"></c:out></td>
						<td><c:out value="${c.getTipo_usuario()}"></c:out></td>
						
						      <c:choose>       
						         <c:when test = "${c.getTipo_usuario() == 'Administrativo'}">
						            <td><a href="AdministradorDetalleController?id=${c.getId_reg()}">Editar </a> | <a href="UsuarioBorrarController?id=${c.getId_reg()}">Borrar</a></td>
						         </c:when>
						         
						         <c:when test = "${c.getTipo_usuario() == 'Cliente'}">
						           <td><a href="ClienteDetalleController?id=${c.getId_reg()}">Editar </a> | <a href="UsuarioBorrarController?id=${c.getId_reg()}">Borrar</a></td>
						         </c:when>
	
							     <c:when test = "${c.getTipo_usuario() == 'Profesional'}">
						            <td><a href="ProfesionalDetalleController?id=${c.getId_reg()}">Editar </a> | <a href="UsuarioBorrarController?id=${c.getId_reg()}">Borrar</a></td>
						         </c:when>					         
						      </c:choose>						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>