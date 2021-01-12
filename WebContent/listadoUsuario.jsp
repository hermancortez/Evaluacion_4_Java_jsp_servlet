<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Listado de usuarios</title>
	
	<link rel="stylesheet" href="estilos.css" type="text/css">	
</head>
<body>
	<div class="superior">
                <nav>
                    Listado de Usuarios | 
                    <a href="Home">Home</a>  |
                    <a href="Contacto">Contacto</a> | 
                    <a href="Crearcapacitacion">Crear capacitación</a> |
                    <a href="Listar">Listado capacitaciones</a> |
                    <a href="Login">Ingresa a tu cuenta</a> |
                    <a href="CerrarSesion">Cerrar Sesión</a> |
                    <a href="UsuarioController">Resgistro de Usuario</a> |
                </nav>
	
	
		<div class="encabezado">
			
			<h1>Listado de usuarios</h1>
		   
		</div>
	</div>

	<div class="medio">
		
		<table class="tabla">

			<tr class="campos">
				<th>Run</th>
				<th>Nombres y apellidos</th> 
				<th>Tipo de usuario</th>
				<th>Eliminar</th>
				<th>Modificar</th>
			</tr>
			<tr class="datos">
				<td>25.697.835-0<t/d>
				<td>cesar celimen</td>
				<td>administrativo</td>
				<td><input type="reset" id="eliminar" class="btn btn-danger" value= "Eliminar"></td>
				<td><a href="editaradministrativo.html" class="btn btn-success">Modificar</a></td>
			</tr>

			<tr class="datos">
				<td>24.111.333-0<t/d>
				<td>edgar torres </td>
				<td>profesional</td>
				<td><input type="reset" id="eliminar" class="btn btn-danger" value= "Eliminar"></td>
				<td><a href="editarprofesional.html" class="btn btn-success">Modificar</a></td>
			</tr>

			<tr class="datos" >
				<td>14.345.999-k<t/d>
				<td>las marias </td>
				<td>cliente</td>
				<td><input type="reset" id="eliminar" class="btn btn-danger"  value= "Eliminar"></td>
				<td><a href="editarcliente.html" class="btn btn-success">Modificar</a></td>
			</tr>
	   	</table>
	</div>	
</body>
</html>