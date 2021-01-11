package model;

import java.util.List;

public interface IUsuarioDAO {

	public void createUsuario(Usuario u);
	public List<Usuario> readAll();	
	public void updateUsuario(Usuario u);
	public void deleteUsuario(int id);
	public Usuario readOne(int id);
}
