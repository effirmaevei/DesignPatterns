package MetodoFabrica;
import MetodoFabrica.abstracciones.Fabrica;
import MetodoFabrica.abstracciones.Producto;
import MetodoFabrica.fabricasConcretas.FabricaCapacitor;
import MetodoFabrica.fabricasConcretas.FabricaCirculo;
import MetodoFabrica.fabricasConcretas.FabricaRectangulo;

public class DemoMetodoFabrica {
	
	public static void main(String[] args) {
		
		Fabrica fabRect = new FabricaRectangulo();
		Fabrica fabCircle = new FabricaCirculo();
		Fabrica fabCapacitor = new FabricaCapacitor();
		
		/*
		 * The goal is creating an object and letting a subclass 
		 * (a concrete factory) define which class to create the
		 * object (product) from.
		 */
		
		Producto rect = fabRect.fabricarProducto("aleatorio");
		Producto circle = fabCircle.fabricarProducto("aleatorio");
		Producto capacitor = fabCapacitor.fabricarProducto("super");
		Producto capacitor2 = fabCapacitor.fabricarProducto("super");
		Producto capacitor3 = fabCapacitor.fabricarProducto("super");

		// Not part of Factory Method. For demo purposes.
		Pokedex.analyze(rect);
		Pokedex.analyze(circle);
		Pokedex.analyze(capacitor);
		Pokedex.analyze(capacitor3);		
		
	}	
	
}
