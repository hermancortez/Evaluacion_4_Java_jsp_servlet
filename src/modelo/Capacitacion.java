/**
 * 
 */
package modelo;

/**
 * @author silva
 *
 */
public class Capacitacion extends Usuario {
	
	private int identificador;
	private String dia;
	private int hora;
	private String lugar;
	private int duracion;
	private int cantAsist;
	
	
	/**
	 * getters y setters
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	/**
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}
	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}
	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return the cantAsist
	 */
	public int getCantAsist() {
		return cantAsist;
	}
	/**
	 * @param cantAsist the cantAsist to set
	 */
	public void setCantAsist(int cantAsist) {
		this.cantAsist = cantAsist;
	}
	
	/**
	 * Constructor vacio 
	 */
	public Capacitacion() {
		super();
	}
	/**
	 * Constructor con todos los atributos
	 * @param identificador
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantAsist
	 */
	public Capacitacion(int identificador, String dia, int hora, String lugar, int duracion, int cantAsist) {
		super();
		this.identificador = identificador;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsist = cantAsist;
	}
	
	/*
	 * metodo to string
	 */
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
				+ ", duracion=" + duracion + ", cantAsist=" + cantAsist + "]";
	}
	
	
}


