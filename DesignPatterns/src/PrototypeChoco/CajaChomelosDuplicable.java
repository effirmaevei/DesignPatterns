package PrototypeChoco;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class CajaChomelosDuplicable extends CajaChomelos implements IDuplicable {

	public CajaChomelosDuplicable(List<Chomelo> choc, Cubierta _cubierta) {
		this.chocList = choc;
		this.cubierta = _cubierta;
	}

	private CajaChomelosDuplicable(CajaChomelosDuplicable caja) {

		chocList = new ArrayList<Chomelo>(caja.getChocList().size());
		for (Chomelo chomelo : caja.getChocList()) {
			chocList.add(((ChomeloDuplicable) (chomelo)).duplicate());
		}

		cubierta = ((CubiertaDuplicable) (caja.cubierta)).duplicate();
	}

	@Override
	public CajaChomelos duplicate() {
		return new CajaChomelosDuplicable(this);
	}

}
