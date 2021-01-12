/**
 * 
 */
package implementacion;

import java.util.ArrayList;
import java.util.List;

import interfaces.ICapacitacion;
import modelo.Capacitacion;

/**
 * @author silva
 *
 */
public class CapaImplements implements ICapacitacion {
	
	@Override
	public void registrocapacitacion(Capacitacion capa) {
		
		capa.setCantAsist(10);
		capa.setDia("10 de junio");
		capa.setDuracion(4);
		capa.setHora(4);
		capa.setIdentificador(125);
		capa.setLugar("San Antonio");
		
		
		
		System.out.println(capa.getCantAsist());
		System.out.println(capa.getDia());
		System.out.println(capa.getDuracion());
		System.out.println(capa.getHora());
		System.out.println(capa.getIdentificador());
		System.out.println(capa.getLugar());

	}
	
	
	@Override
	public List<Capacitacion> liscapacitacion() {
		
		
		Capacitacion lisCap = new Capacitacion();
		
		lisCap.setCantAsist(30);;
		lisCap.setDia("18 de octubre");
		lisCap.setDuracion(2);
		lisCap.setHora(2);
		lisCap.setIdentificador(123);
		lisCap.setLugar("Santiago");
		
		
		
		Capacitacion lisCap1 = new Capacitacion();
		
		lisCap1.setCantAsist(25);
		lisCap1.setDia("25 de junio");
		lisCap1.setDuracion(3);
		lisCap1.setHora(3);
		lisCap1.setIdentificador(124);
		lisCap1.setLugar("Melipilla");
		
		
		Capacitacion lisCap2 = new Capacitacion();
		
		lisCap2.setCantAsist(10);
		lisCap2.setDia("10 de junio");
		lisCap2.setDuracion(4);
		lisCap2.setHora(4);
		lisCap2.setIdentificador(125);
		lisCap2.setLugar("San Antonio");
		
		
		List<Capacitacion> lista= new ArrayList<Capacitacion>();
		
		lista.add(lisCap);
		lista.add(lisCap1);
		lista.add(lisCap2);
		
		return lista;
	}






}
