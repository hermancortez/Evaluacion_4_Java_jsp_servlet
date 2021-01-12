package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Capacitacion;

/**
 * Servlet implementation class FormulCrearCapacitacion
 */
@WebServlet("/FormulCrearCapacitacion")
public class FormulCrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	String nombre;
	String lugar;
	String email;
	int duracion;
	String comentario;
	int cantAsist;
	int identificador;
	int hora;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormulCrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		nombre = request.getParameter("nombre");
		lugar = request.getParameter("lugar");
		email =request.getParameter("email");
		duracion = Integer.parseInt(request.getParameter("duracion"));
		comentario =request.getParameter("comentario");
		cantAsist = Integer.parseInt(request.getParameter("cantAsist"));
		identificador =Integer.parseInt(request.getParameter("identificador"));
		hora = Integer.parseInt(request.getParameter("hora"));
		
		Capacitacion capa =new Capacitacion();
		
		
		capa.setNombre(nombre);
		capa.setLugar(lugar);
		capa.setDia(lugar);;
		capa.setDuracion(duracion);
		capa.setCantAsist(cantAsist);
		capa.setIdentificador(identificador);
		capa.setHora(hora);
		

		String nombre = capa.getNombre();
		String lugar = capa.getLugar();
		String dia =capa.getDia();
		int duracion = capa.getDuracion();
		int cantAsist = capa.getCantAsist();
		int identificador = capa.getIdentificador();
		int hora = capa.getHora();
		
		request.setAttribute("nombre", nombre);
		request.setAttribute("lugar", lugar);
		request.setAttribute("dia", dia);
		request.setAttribute("duracion", duracion);
		request.setAttribute("CantAsist", cantAsist);
		request.setAttribute("identificador", identificador);
		request.setAttribute("hora", hora);
		
		getServletContext().getRequestDispatcher("/FormularioCrearCapa.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}