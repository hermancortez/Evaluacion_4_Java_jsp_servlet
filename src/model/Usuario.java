package model;

public class Usuario {
	
	private int id_reg;
	private String nombres;
	private String apellidos;
	private String fecha_nac;
	private double tipo_usuario;
	
	public Usuario() {	}

	public Usuario(int id_reg, String nombres, String apellidos, String fecha_nac, double tipo_usuario) {
		super();
		this.id_reg = id_reg;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_nac = fecha_nac;
		this.tipo_usuario = tipo_usuario;
	}

	/**
	 * @return the id_reg
	 */
	public int getId_reg() {
		return id_reg;
	}

	/**
	 * @param id_reg the id_reg to set
	 */
	public void setId_reg(int id_reg) {
		this.id_reg = id_reg;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fecha_nac
	 */
	public String getFecha_nac() {
		return fecha_nac;
	}

	/**
	 * @param fecha_nac the fecha_nac to set
	 */
	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	/**
	 * @return the tipo_usuario
	 */
	public double getTipo_usuario() {
		return tipo_usuario;
	}

	/**
	 * @param tipo_usuario the tipo_usuario to set
	 */
	public void setTipo_usuario(double tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	
	
}
