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

		String sql = "insert into registrarusuario (id_reg, nombres, apellidos, fecha_nac, tipo_usuario) values (" + 
				u.getId_reg() + ", '" + u.getNombres() + "', '" + u.getApellidos() + "', '" + u.getFecha_nac() + "', '" + u.getTipo_usuario() + "')";
		
		System.out.println(sql);
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método createUsuario");
			e.printStackTrace();
		}
	}

	@Override
	public List<Usuario> readAll() {

		List<Usuario> lista = new ArrayList<Usuario>();
		Usuario usu = null;
		
		String sql = "select id_reg, nombres, apellidos, fecha_nac, tipo_usuario from registrarusuario";
		
		System.out.println(sql);
		
		try {
			
			Connection cn = Conexion.getConnection();
			System.out.println("Connection c " + cn);
			
			Statement s = cn.createStatement();
			System.out.println("Statement s " + s);
			
			ResultSet rs = s.executeQuery(sql);
			System.out.println("rs " + rs);
			
			while (rs.next()) {
				lista.add(new Usuario(rs.getInt("id_reg"), rs.getString("nombres"), rs.getString("apellidos"), rs.getString("fecha_nac"), rs.getString("tipo_usuario") ));
			}
			
			s.close();
			
			
		} catch (SQLException e) {
			System.out.println("Error en metodo readAll");
			e.printStackTrace();
		}
				
		return lista;
	}

	@Override
	public void updateUsuario(Usuario u) {
		
		String sql = "update registrarusuario set nombres ='" + u.getNombres() + "', apellidos ='" + u.getApellidos() + "', "
				+ "fecha_nac='" + u.getFecha_nac() + "', tipo_usuario='" + u.getTipo_usuario() + "' where id_reg = " + u.getId_reg();
		
		System.out.println(sql);
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método updateUsuario");
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteUsuario(int id) {
		
		String sql = "delete from registrarusuario where id_reg =" + id; 
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			//cn.close();
			
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
			Statement s = c.createStatement();
			String sql = "select id_reg, nombres, apellidos, fecha_nac, tipo_usuario from registrarusuario where id_reg=" + id;
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				//creo una instancia de cliente, le paso los datos del resultset, y lo agrego a la lista.
				usu = new Usuario(rs.getInt("id_reg"),rs.getString("nombres"), rs.getString("apellidos") , rs.getString("fecha_nac") , rs.getString("tipo_usuario"));
			}
			
			s.close();
			//c.close();
						
		} catch (SQLException e) {
			System.out.println("Error en método readOne");
			e.printStackTrace();
		}
		
		return usu;
		
		
	}

}
