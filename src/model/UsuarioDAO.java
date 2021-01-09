package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;


public class UsuarioDAO implements IUsuarioDAO {

	@Override
	public void createUsuario(Usuario u) {

		String sql = "insert into registrausuario (id_reg, nombres, apellidos, fecha_nac, tipo_usuario) values (" + 
				u.getId_reg() + ", " + u.getNombres() + ", " + u.getApellidos() + 
				", " + u.getFecha_nac() + ", " + u.getTipo_usuario() + ")";
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			cn.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método createUsuario");
			e.printStackTrace();
		}
	}

	@Override
	public List<Usuario> readAll() {

		List<Usuario> lista = new ArrayList<Usuario>();
		
		try {
			
			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();
			String sql = "select id_reg, nombres, apellidos, fecha_nac, tipo_usuario from registrarusuario";
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				
				lista.add(new Usuario(rs.getInt("id_reg"),rs.getString("nombres"), rs.getString("apellidos") , rs.getString("fecha_nac") , rs.getString("tipo_usuario") ));
			}
			
		} catch (SQLException e) {
			System.out.println("Error en método readAll");
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public void updateUsuario(Usuario u) {
		
		String sql = "update usuario set (nombres ='" + u.getNombres() + "', apellidos ='" + u.getApellidos() + "', fecha_nac='" + u.getFecha_nac() + "', tipo_usuario=" + u.getTipo_usuario() + ")"; 
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			cn.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método updateUsuario");
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteUsuario(Usuario u) {
		String sql = "delete from registrarusuario where id_reg =" + u.getId_reg(); 
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			cn.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método updateUsuario");
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public Usuario readOne(int id) {
		
		Usuario usu = null;
		
		try {
			
			//establecemos conexión con objeto Singleton
			Connection c = Conexion.getConnection();
			//
			Statement s = c.createStatement();
			String sql = "select nombres, apellidos, fecha_nac, tipo_usuario from registrarusuario where id_reg=" + id;
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				//creo una instancia de cliente, le paso los datos del resultset, y lo agrego a la lista.
				usu = new Usuario(rs.getInt("id_reg"),rs.getString("nombres"), rs.getString("apellidos") , rs.getString("fecha_nac") , rs.getString("tipo_usuario"));
			}
			
		} catch (SQLException e) {
			System.out.println("Error en método readAll");
			e.printStackTrace();
		}
		
		return usu;
		
		
	}

}
