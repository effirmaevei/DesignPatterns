package MetodoFabrica.fabricasConcretas;

import MetodoFabrica.abstracciones.Fabrica;
import MetodoFabrica.abstracciones.Producto;
import MetodoFabrica.productosConcretos.Rectangulo;

public class FabricaRectangulo extends Fabrica{

	/**
	 * @param altura
	 * @param base 
	 */
	@Override
	public Producto fabricarProducto(String type) {
		
		if ("aleatorio".equalsIgnoreCase(type)) {
			return new Rectangulo();
		}
		
		return null;
	}	
}
