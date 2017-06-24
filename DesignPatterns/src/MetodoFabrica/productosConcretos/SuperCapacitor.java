package MetodoFabrica.productosConcretos;

import MetodoFabrica.abstracciones.Producto;

public class SuperCapacitor extends Producto {

	private static int serial;
	
	public SuperCapacitor() {
		name = "Super Capacitor";
		barCode = "SCA" + (++serial);
	}
	
	@Override
	public String operacion() {
		return name +" "+ barCode +  "\n*******\n";
	}
	
}
