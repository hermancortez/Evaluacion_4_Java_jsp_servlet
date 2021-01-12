<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Profesional</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Editar Profesional</h1>
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
		<form action="ProfesionalDetalleController" method="POST">
			<div class="mb-3">
				<label for="id" class="form-label">ID</label> 
				<input type="number" class="form-control" id="id" name="id" readonly="readonly" placeholder="numero" value="${usuario.getId_reg()}">
			</div>
			<div class="mb-3">
				<label for="nombres" class="form-label">Nombres</label> 
				<input type="text" class="form-control" id="nombres" name="nombres" placeholder="Nombres" value="${usuario.getNombres()}">
			</div>
			<div class="mb-3">
				<label for="apellidos" class="form-label">Apellidos</label> 
				<input type="text" class="form-control" id="apellidos" name="apellidos" placeholder="Apellidos" value="${usuario.getApellidos()}">
			</div>
			<div class="mb-3">
				<label for="fecha_nac" class="form-label">Fecha Nacimiento</label> 
				<input type="text" class="form-control" id="fecha_nac" name="fecha_nac" placeholder="Fecha Nacimiento" value="${usuario.getFecha_nac()}">
			</div>
			<div class="mb-3">
				<label for="tipo_usuario" class="form-label">Tipo de Usuario</label> 
				<input type="text" class="form-control" id="tipo_usuario" name="tipo_usuario" readonly="readonly" placeholder="Tipo de Usuario" value="${usuario.getTipo_usuario()}">
			</div>
			<div class="mb-3">
				<label for="run" class="form-label">Run</label> 
				<input type="text" class="form-control" id="run" name="run" placeholder="Ingrese run" value="${usuario.getRun()}">
			</div>
			<div class="mb-3">
				<label for="fono" class="form-label">Telefono</label> 
				<input type="text" class="form-control" id="fono" name="fono" placeholder="Ingrese Telefono" value="${usuario.getFono()}">
			</div>
			<div class="mb-3">
				<label for="titulo" class="form-label">Titulo Profesional</label> 
				<input type="text" class="form-control" id="titulo" name="titulo" placeholder="Ingrese Titulo" value="${usuario.getTitulo()}">
			</div>	
			<div class="mb-3">
				<label for="proyecto" class="form-label">Proyecto</label> 
				<input type="text" class="form-control" id="proyecto" name="proyecto" placeholder="Ingrese Proyecto" value="${usuario.getProyecto()}">
			</div>				
			 <div class="col-12">
    			
    			<a class="nav-link active" href="ProfesionalDetalleController"><button type="submit" class="btn btn-primary">Editar</button></a>
  			</div>
		</form>
	</div>
</body>
</html>