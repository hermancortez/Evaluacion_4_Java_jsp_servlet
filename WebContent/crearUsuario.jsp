<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Usuarios</title>
	<link rel="stylesheet" href="estilos.css" type="text/css">	
</head>
<body>
	<div class="superior">
                <nav>
                    Registro de Usuarios | 
                    <a href="Home">Home</a>  |
                    <a href="Contacto">Contacto</a> | 
                    <a href="Crearcapacitacion">Crear capacitación</a> |
                    <a href="Listar">Listado capacitaciones</a> |
                    <a href="Login">Ingresa a tu cuenta</a> |
                    <a href="CerrarSesion">Cerrar Sesión</a> |
                    <a href="ListadoUsuarios">Listado de usuarios</a> |

                </nav>

		<div class="encabezado">

			<h1>Registrar usuario</h1>
			   
		</div>

	</div>


	<div class="formulario">
		<form method="post" action="#" id="formulario">
			<div class="campo">
				<label for="Nombre">Nombre:</label>
				 <input type="text" id="Nombre" required/>
			</div>

			<div class="campo">
				<div class="en-linea izquierdo">
					<label for="apellidos">Apellidos:</label>
					<input type="text" id="apellidos" required/>
				</div>
					<br><br>
				<div class="en linea">
					<label for="fecha">Fecha de nacimiento:</label>
					<input type="date" id="fecha" required/>
				</div>
			</div>

			<div class="campo">
				<div class="en-linea izquierdo">

					Tipo de usuario

					<select class="form-control" name="tipoUsuario"  required data-error="selecciona una opcion">
						<option></option>
						<option>Administrativo</option>  
						<option>Cliente</option>                                                                                                                                
						<option>Profesional</option>                                                                              
					</select>
				</div>
			</div>

			<div class="botones"> 
				<input type="submit" id="boton-enviar" value="Guardar"/>
				<p class="mensaje" id="mensaje"></p>
			</div>
		</form>
  
	</div>
</body>
</html>