<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	
	<title>Login</title>

    <link rel="stylesheet" href="estilos.css"/>

    <script src="scriptlogin.js"></script>
</head>

<body>

       
        <div class="superior">
                <nav>
                    Ingresa a tu cuenta | 
                    <a href="CerrarSesion">Cerrar Sesión</a> |
                </nav>
                <br><br>
                
                <div class="encabezado">
                    
                    <h1>Ingresa a tu cuenta</h1>                
                   
                </div>
         

        </div>   
        <br><br>
        <div class="contenedor"> 

            <div class="formulario">


                <form method="post" action="Login" id="formulario" onsubmit="return validacion()"> 
                    
                    <div class="campo">
                    
                        <label for="usuario">Usuario</label>
                        <input type="text" id="usuario" name="usuario"  placeholder="Ingrese Usuario"  required>
                                                                         
                    </div>

                    <div class="campo">
                        <label for="contrasena">Ingresa tu contraseña</label>
                        <input type="text" id="contrasena"  name="contrasena"   placeholder="Ingrese contraseña" required>
                    </div>
                    
                                                    
                    <div class="botones">
                        <button  id="confirm" type="submit" onclick="return validar()"  >Validar</button>
                    </div> 

                </form>
                   
            </div>       

        </div>
</body>
</html>