/**
 * 
 */
package modelo;

/**
 * @author silva
 *
 */
public class Profesional {
	
	private String titulo;
	private String fechaIng;
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the fechaIng
	 */
	public String getFechaIng() {
		return fechaIng;
	}
	/**
	 * @param fechaIng the fechaIng to set
	 */
	public void setFechaIng(String fechaIng) {
		this.fechaIng = fechaIng;
	}
	
	/**
	 * Constructor Vacio 
	 */
	public Profesional() {
		super();
	}
	/**
	 * Constructor con todos los atributos
	 * @param titulo
	 * @param fechaIng
	 */
	public Profesional(String titulo, String fechaIng) {
		super();
		this.titulo = titulo;
		this.fechaIng = fechaIng;
	}
	
	/*
	 * metodo to string
	 */
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIng=" + fechaIng + "]";
	}
	
	
	

}
