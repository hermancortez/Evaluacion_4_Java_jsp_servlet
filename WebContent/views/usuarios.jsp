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
						<td><a href="d/?id=${c.getId_reg()}"><c:out value="${c.getId_reg()}"></c:out></a></td>
						<td><c:out value="${c.getNombres()}"></c:out></td>
						<td><c:out value="${c.getApellidos()}"></c:out></td>
						<td><c:out value="${c.getFecha_nac()}"></c:out></td>
						<td><c:out value="${c.getTipo_usuario()}"></c:out></td>
						<td>Editar | Borrar</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>