/**
 * 
 */
package modelo;

/**
 * @author silva
 *
 */
public class Cliente {
	
	private String rut;
	private String nombres;
	private String apellidos;
	private int telefono;
	private String AFP;
	private int sistsalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getAFP() {
		return AFP;
	}
	public void setAFP(String aFP) {
		AFP = aFP;
	}
	public int getSistsalud() {
		return sistsalud;
	}
	public void setSistsalud(int sistsalud) {
		this.sistsalud = sistsalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * 
	 */
	public Cliente() {
		super();
	}
	/**
	 * @param rut
	 * @param nombres
	 * @param apellidos
	 * @param telefono
	 * @param aFP
	 * @param sistsalud
	 * @param direccion
	 * @param comuna
	 * @param edad
	 */
	public Cliente(String rut, String nombres, String apellidos, int telefono, String aFP, int sistsalud,
			String direccion, String comuna, int edad) {
		super();
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		AFP = aFP;
		this.sistsalud = sistsalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	
	/*
	 * metodo to string
	 */
	
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", AFP=" + AFP + ", sistsalud=" + sistsalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + "]";
	}
	
	
	
}



