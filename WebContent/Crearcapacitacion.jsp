<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
        <link rel="stylesheet" href="estilos.css" type="text/css">	
        <title>Registro de capacitacion</title>
</head>
<body>
    <body>
        <div class="superior">
            <nav>
                	Crear Capacitacion | 
                    <a href="Home">Home</a>  | 
                    <a href="Contacto">Contacto</a> |
                    <a href="Listar">Listado capacitaciones</a> |
                    <a href="Login">Ingresa a tu cuenta</a> |
                    <a href="CerrarSesion">Cerrar Sesión</a> |
                    <a href="UsuarioCrearController">Registro de Usuario</a> |
                    <a href="UsuarioController">Listado de Usuarios</a> |
                </nav>
         
            <div class="encabezado">

                <h1>Registro de capacitación</h1>
               
            </div>
        </div>

        <div class="contenedor">
            <div class="formulario">
				<form method="post" action="#" id="formulario">
                    <div class="campo">
                         <label for="Nombre">Nombre y apellido:</label>
                         <input type="text" id="Nombre" required/>
                    </div>
                <div class="campo">
                	<div class="en-linea izquierdo">
						<label for="lugar">Lugar</label>
						<input type="text" id="lugar" required/>
				    </div>
                    <br><br>
					<div class="en linea">
						<label for="email">Correo electrónico:</label>
                        <input type="email" id="email" required/>
					</div>
				</div>

                <div class="campo">
                    <div class="en-linea izquierdo">
						<label for="duracion">Duración:</label>
						<input type="time" id="duracion" required/>
                    </div>
                        
                    <div class="en-linea">
						<label for="hora">Comentario:</label>
						<input type="text" id="comentario" required/>
                    </div>
                </div>

                <div class="botones">
                    <button  type="submit" id="boton-enviar" >Enviar</button>
                </div>
               </form>
            </div>
        </div>
    </body>
</body>
</html>