package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Contacto
 */
@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*
		 * 
		 */

		HttpSession sesion = request.getSession();
		Object usuario = (String) sesion.getAttribute("usuario");

		if (usuario == null) {

			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);

		} else {
			getServletContext().getRequestDispatcher("/Contacto.jsp").forward(request, response);
			
		}
			
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*
		 * inicio de variables y receptor de informacion enviada desde vista, a traves del formulario.
		 * La forma de recibir la informacion es atraves del nombre del Input
		 */

		String nombre = request.getParameter("nombre");
		String correo= request.getParameter("correo");
		int telefono= Integer.parseInt(request.getParameter("telefono"));
		String asunto= request.getParameter("asunto");
		String comentario= request.getParameter("comentario");
        
		response.setContentType("text/html;charset=UTF-8");
		
		/*
		 * imprimir por consola la inofrmacion recibida desde vista
		 */
		
		System.out.println(nombre);
		System.out.println(correo);
		System.out.println(telefono);
		System.out.println(asunto);
		System.out.println(comentario);
		
		/*
		 * una vez ejecutado el proceso, el servlet se redirije a la misma pagina
		 */
		
		getServletContext().getRequestDispatcher("/Contacto.jsp").forward(request, response);

		
	}


}
