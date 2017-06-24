package MetodoFabrica.fabricasConcretas;

import MetodoFabrica.abstracciones.Fabrica;
import MetodoFabrica.abstracciones.Producto;
import MetodoFabrica.productosConcretos.Capacitor;
import MetodoFabrica.productosConcretos.SuperCapacitor;

public class FabricaCapacitor extends Fabrica {
	
	@Override
	public Producto fabricarProducto(String type) {
		
		if ("normal".equalsIgnoreCase(type)) {
			return new Capacitor();
		} else if ("super".equalsIgnoreCase(type)) {
			return new SuperCapacitor();
		} else if ("aleatorio".equalsIgnoreCase(type)) {
			//TODO add CapacitorAleatorio class
			return null;
		}
		
		return null;

	}

}
