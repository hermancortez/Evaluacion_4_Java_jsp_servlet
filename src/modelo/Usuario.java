/**
 * 
 */
package modelo;

/**
 * @author silva
 *
 */
public class Usuario {
	private String nombre;
	private String FechaNac;
	private int run;
	
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the fechaNac
	 */
	public String getFechaNac() {
		return FechaNac;
	}
	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(String fechaNac) {
		FechaNac = fechaNac;
	}
	/**
	 * @return the run
	 */
	public int getRun() {
		return run;
	}
	/**
	 * @param run the run to set
	 */
	public void setRun(int run) {
		this.run = run;
	}
	
	
	/**
	 * Constructo vacio
	 */
	public Usuario() {
		super();
	}
	/**
	 * constructor con todos los atributos
	 * @param nombre
	 * @param fechaNac
	 * @param run
	 */
	public Usuario(String nombre, String fechaNac, int run) {
		super();
		this.nombre = nombre;
		FechaNac = fechaNac;
		this.run = run;
	}
	
	/*
	 * metodo to string
	 */
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", FechaNac=" + FechaNac + ", run=" + run + "]";
	}
	
	
}
