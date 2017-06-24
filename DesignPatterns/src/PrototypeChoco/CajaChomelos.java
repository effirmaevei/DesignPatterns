package PrototypeChoco;

import java.util.List;

/**
 * @author Jose Manuel Ferreira Benavides
 *
 */
public abstract class CajaChomelos {

	protected List<Chomelo> chocList;
	protected Cubierta cubierta;
	private static int totalInstances;

	public CajaChomelos() {
		totalInstances++;
	}

	public static int getTotalInstances() {
		return totalInstances;
	}

	public List<Chomelo> getChocList() {
		return chocList;
	}
	
	@Override
	public String toString() {
		return "Caja con " + chocList.size() + " chomelos con relleno de "
							+ chocList.get(0).getRelleno() + ". La cubierta es de color "
							+ cubierta.getColor(); 
	}

}
