package MetodoFabrica.productosConcretos;

import MetodoFabrica.abstracciones.Producto;

public class Rectangulo extends Producto {
	
	private int lado;
	
	public Rectangulo(){
		name = "Rectangulo Tipo Aleatorio";
		barCode = "";	
		lado = (int) (Math.random()*10 + 1);
	}
	
	@Override
	public String operacion() {
		return name + "\nLado: " + lado + "\nArea: " 
					+ (Math.pow(lado, 2)*Math.PI) +  "\n*******\n";
	}
	
}
