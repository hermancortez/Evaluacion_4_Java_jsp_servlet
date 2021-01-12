package model;

public class Usuario {
	
	private int id_reg;
	private String nombres;
	private String apellidos;
	private String fecha_nac;
	private String tipo_usuario;
	private String run;
	private String email;
	private String area;
	private String fono;
	private String titulo;
	private String proyecto;
	private String afp;
	private String sissalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	public Usuario() {
		super();
	}
	

	public Usuario(int id_reg, String nombres, String apellidos, String fecha_nac, String tipo_usuario, String run,
			String email, String area, String fono, String titulo, String proyecto, String afp, String sissalud,
			String direccion, String comuna, int edad) {
		super();
		this.id_reg = id_reg;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_nac = fecha_nac;
		this.tipo_usuario = tipo_usuario;
		this.run = run;
		this.email = email;
		this.area = area;
		this.fono = fono;
		this.titulo = titulo;
		this.proyecto = proyecto;
		this.afp = afp;
		this.sissalud = sissalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
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
	public String getTipo_usuario() {
		return tipo_usuario;
	}


	/**
	 * @param tipo_usuario the tipo_usuario to set
	 */
	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}


	/**
	 * @return the run
	 */
	public String getRun() {
		return run;
	}


	/**
	 * @param run the run to set
	 */
	public void setRun(String run) {
		this.run = run;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}


	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}


	/**
	 * @return the fono
	 */
	public String getFono() {
		return fono;
	}


	/**
	 * @param fono the fono to set
	 */
	public void setFono(String fono) {
		this.fono = fono;
	}


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
	 * @return the proyecto
	 */
	public String getProyecto() {
		return proyecto;
	}


	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}


	/**
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}


	/**
	 * @param afp the afp to set
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}


	/**
	 * @return the sissalud
	 */
	public String getSissalud() {
		return sissalud;
	}


	/**
	 * @param sissalud the sissalud to set
	 */
	public void setSissalud(String sissalud) {
		this.sissalud = sissalud;
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}


	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
