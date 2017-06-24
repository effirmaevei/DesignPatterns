package MetodoFabrica.productosConcretos;

import MetodoFabrica.abstracciones.Producto;

public class Capacitor extends Producto {

	private static int serial;
	
	public Capacitor() {
		name = "Capacitor";
		barCode = "CAP" + (++serial);
	}
	
	@Override
	public String operacion() {
		return name +" "+ barCode + "\n*******\n";
	}

}
