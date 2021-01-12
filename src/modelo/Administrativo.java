/**
 * 
 */
package modelo;

/**
 * @author silva
 *
 */
public class Administrativo {
	
	private String area;
	private String expPrevia;
	
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
	 * @return the expPrevia
	 */
	public String getExpPrevia() {
		return expPrevia;
	}
	/**
	 * @param expPrevia the expPrevia to set
	 */
	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}
	/**
	 * Constructor vacio
	 */
	public Administrativo() {
		super();
	}
	/**
	 * constructor con todos los atributos
	 * @param area
	 * @param expPrevia
	 */
	public Administrativo(String area, String expPrevia) {
		super();
		this.area = area;
		this.expPrevia = expPrevia;
	}
	
	
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expPrevia=" + expPrevia + "]";
	}
	
	

}
