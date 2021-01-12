/**
 * JS Validacion Login
 */


function validacion() {

    let nombre=document.getElementById("usuario").value;
    let clave=document.getElementById("contrasena").value;

    if(nombre.length == 0 ){

        alert("[ERROR] Ingrese nombre de ususario");
        return false;

    } else if ( clave.length == 0 ){

        alert("Ingrese su clave");
        return false;

    }else if (nombre != "admin"){

        alert("Ingrese un usuario valido");

    }else if (clave != 1234){

        alert("Ingrese la clave correcta");
    }
}

	
	function validar(){
	
	let usuario = document.getElementById("usuario").value;
	let contrasena = document.getElementById("contrasena").value;

	
	if(usuario === "admin" && contrasena == 1234){
	
		alert("Estamos ready");
		
                                    
       }
		
	}


	