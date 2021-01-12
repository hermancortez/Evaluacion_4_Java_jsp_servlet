<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Capacitaciones</title>
	<link rel="stylesheet" href="estilos.css" type="text/css">	
</head>
<body>
	<div class="superior">
				
					<nav>
					Listado Capacitaciones |
					<a href="Home">Home</a>  | 
                    <a href="Contacto">Contacto</a> |
                    <a href="Crearcapacitacion">Crear capacitacion</a> |
                    <a href="Login">Ingresa a tu cuenta</a> |
                    <a href="CerrarSesion">Cerrar Sesión</a> |
                    <a href="UsuarioCrearController">Registro de Usuario</a> |
                    <a href="UsuarioController">Listado de Usuarios</a> |                    
                </nav>
		<div class="encabezado">
		
			<h1>Listado de capacitaciones</h1>
	   
		</div>
	</div>

	<div class="medio">
		
		<table class="tabla">
			<tr class="campos">
				<th>Id de capacitación</th>
				<th>Fecha de capacitación</th> 
				<th>Hora de capacitación</th>
				<th>Nombre del cliente</th>
				<th>Eliminar</th>
				<th>Modificar</th>
			</tr>

			<tr class="datos" >
				<td>554577<t/d>
				<td>02/02/21</td>
				<td>12:30</td>
				<td>cesar celimen</td>
				<td><a href="#" id="eliminar" class="btn btn-danger">Eliminar</a></td>
				<td><a href="#" class="btn btn-success">Modificar</a></td>
			</tr>

			<tr class="datos" >
				<td>554578<t/d>
				<td>03/02/21</td>
				<td>12:30</td>
				<td>Ana celimen</td>
				<td><a href="#" id="eliminar" class="btn btn-danger">Eliminar</a></td>
				<td><a href="#" class="btn btn-success">Modificar</a></td>
			</tr>

			<tr class="datos">
				<td>554579<t/d>
				<td>01/02/21</td>
				<td>12:30</td>
				<td>juan celimen</td>
				<td><a href="#" id="eliminar" class="btn btn-danger">Eliminar</a></td>
				<td><a href="#" class="btn btn-success">Modificar</a></td>
			</tr>
	   	</table>	
	</div>
</body>
</html>