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
 * Servlet implementation class UsuarioDetalleController
 */
@WebServlet("/UsuarioDetalleController")
public class UsuarioDetalleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioDetalleController() {
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
		getServletContext().getRequestDispatcher("/views/EditarUsuario.jsp").forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Usuario usu = new Usuario(Integer.parseInt(request.getParameter("id")),request.getParameter("nombres"),request.getParameter("apellidos"),request.getParameter("fecha_nac"),request.getParameter("tipo_usuario"));		
		UsuarioDAO uDao = new UsuarioDAO();		
		uDao.updateUsuario(usu);								
		getServletContext().getRequestDispatcher("/views/EditarUsuario.jsp").forward(request, response);	
	}

}
