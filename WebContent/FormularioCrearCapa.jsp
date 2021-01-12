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
<%@page import="modelo.Capacitacion"%>
<%@page import="controlador.*"%>
<meta charset="ISO-8859-1">

<title>Formulario Capacitacion</title>
<link rel="stylesheet" href="estilos.css">
</head>
<body>

 <% Object dato1 = request.getAttribute("nombre"); 
 Object dato2 = request.getAttribute("lugar"); 
 Object dato3 = request.getAttribute("dia");
 Object dato4 = request.getAttribute("duracion");
 Object dato5 = request.getAttribute("cantAsist");
 Object dato6 = request.getAttribute("identificador");
 Object dato7 = request.getAttribute("hora");
 %>
 
 
 <h1>el Nombre del participante es    <%= dato1 %>    </h1>
 <h1>el lugar de la capacitacion es   <%= dato2 %>    </h1>
 <h1>el dia de la capacitacion es  <%= dato3 %>    </h1>
<h1>la duracion  de la capacitacion sera de  <%= dato4 %>    </h1>
<h1>el ID identificador de la capacitacion es <%= dato5 %>    </h1>
<h1>la hora de la capacitacion  es  <%= dato6 %>    </h1>



</body>
</html>