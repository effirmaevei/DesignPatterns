package FacturePrototyper;

import java.util.HashMap;

public class Fabrica {

	static Fabrica fabrica;
	static final char ESPACIO_AUTO = 'A';
	static final char ESPACIO_MOTO = 'M';
	
	HashMap<String, Factura> prototipos = new HashMap<>();

	public static Fabrica getFabrica() {
		if(fabrica==null) fabrica = new Fabrica();
		
		return fabrica;
	}

	public void agregarPrototipo(String key, Factura fact) {
		prototipos.put(key, fact);
	}

	Fabrica() {
		Factura protoAuto = new FacturaDuplicable(ESPACIO_AUTO);
		Factura protoMoto = new FacturaDuplicable(ESPACIO_MOTO);
		
		agregarPrototipo("protoAuto", protoAuto);
		agregarPrototipo("protoMoto", protoMoto);
	}	

	public Factura getPrototipo(String protoKey) {
		return prototipos.get(protoKey);
	}

}