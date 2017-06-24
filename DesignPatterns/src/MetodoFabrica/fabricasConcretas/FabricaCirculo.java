package MetodoFabrica.fabricasConcretas;

import MetodoFabrica.abstracciones.Fabrica;
import MetodoFabrica.abstracciones.Producto;
import MetodoFabrica.productosConcretos.Capacitor;
import MetodoFabrica.productosConcretos.Circulo;
import MetodoFabrica.productosConcretos.Rectangulo;

public class FabricaCirculo extends Fabrica {

	@Override
	public Producto fabricarProducto(String type) {
		
		if ("aleatorio".equalsIgnoreCase(type)) {
			return new Circulo();
		}
		
		return null;
	}

}
