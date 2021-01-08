package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConexionController
 */
@WebServlet("/ConexionController")
public class ConexionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConexionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			
			//validamos qie los drivers esten instalados
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//establecemos la conexion
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:curso","herman","123456");
			
			//crea objeto estamento
			Statement st = con.createStatement();
			
			//creamos un resulset
			//ResultSet rs = st.executeQuery("SELECT \"codigosbif\",\"desc_banco\" FROM \"tbl_banco\"");
			
			ResultSet rs = st.executeQuery("SELECT NOMBRES,APELLIDOS,FECHA_NAC,TIPO_USUARIO  FROM REGISTRARUSUARIO");
			
			while(rs.next()) {
				System.out.println("USUARIO : " + rs.getString("NOMBRES") + " " + rs.getString("APELLIDOS"));
			}
			
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
