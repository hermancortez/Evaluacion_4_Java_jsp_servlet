
create table usuarios (
id int not null primary key,
usuario varchar(255) not null unique,
clave varchar(255)
);

create table contacto(
id_contacto int not null primary key,
nombre varchar(255) not null,
email varchar(255) not null,
fono varchar(255) not null,
asunto varchar(50) not null,
comentario varchar(255) not null
);

create table creacapacitacion(
id_capa int not null primary key,
nombreapellido varchar(255) not null,
lugar varchar(255) not null,
email varchar(255) not null,
duracion varchar(255) not null,
comentario varchar(255) not null
);

create table registrarusuario(
id_reg int not null primary key,
nombres varchar(50) not null,
apellidos varchar(50) not null,
fecha_nac varchar(255) not null,
tipo_usuario varchar(255) not null
);


Evaluacion_4_Java_jsp_servlet