<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<meta charset="ISO-8859-1">
	<title>Listado de usuarios</title>
	
	<link rel="stylesheet" href="estilos.css" type="text/css">	
</head>
<body>
    
	<div class="superior">

        <h1>SeguClap</h1>

     </div>

     <div class="menunav">

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
          <div class="container-fluid">
            <a class="navbar-brand" href="Home">Home</a> 
            <a class="navbar-brand" href="Crearcapacitacion">Crear capacitación</a> 
            <a class="navbar-brand" href="CrearUsuario">Registro de Usuario</a>
            <a class="navbar-brand" href="Contacto">Contacto</a> 
            <a class="navbar-brand" href="Login">Login</a>
            <a class="navbar-brand" href="CerrarSesion">Cerrar Sesión</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
              data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false"
              aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
              <ul class="navbar-nav">
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Listados </a>
                  <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                    <li><a class="dropdown-item" href="ListadoUsuarios">Listado
                        de Usuarios</a></li>
                    <li><a class="dropdown-item" href="Listar">Listado de
                        Capacitaciones</a>
                    </li>

                  </ul>
                </li>
              </ul>
            </div>
          </div>
        </nav>
      </div>
<br><br>

      <div class="encabezado">

        <h1>Listado de Usuarios</h1>

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