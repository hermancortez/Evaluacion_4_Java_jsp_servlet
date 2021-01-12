package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import model.UsuarioDAO;

/**
 * Servlet implementation class AdministradorDetalleController
 */
@WebServlet("/AdministradorDetalleController")
public class AdministradorDetalleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministradorDetalleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		UsuarioDAO uDao = new UsuarioDAO();
		Usuario u = uDao.readOne(id);
		
		request.setAttribute("usuario", u);
		getServletContext().getRequestDispatcher("/views/EditarAdministrativo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String fono = "nulo";
		String titulo = "nulo";
		String proyecto = "nulo";
		String afp = "nulo";		
		String sissalud = "nulo";
		String direccion = "nulo";
		String comuna = "nulo";
		int edad = 0;
		
		Usuario usu = new Usuario(Integer.parseInt(request.getParameter("id")),request.getParameter("nombres"),request.getParameter("apellidos"),request.getParameter("fecha_nac"),request.getParameter("tipo_usuario"),
				request.getParameter("run"), request.getParameter("email"), request.getParameter("area") ,fono, titulo,
				proyecto, afp, sissalud, direccion,comuna,edad);		
		UsuarioDAO uDao = new UsuarioDAO();		
		uDao.updateUsuario(usu);								
		getServletContext().getRequestDispatcher("/UsuarioController").forward(request, response);
	}

}
