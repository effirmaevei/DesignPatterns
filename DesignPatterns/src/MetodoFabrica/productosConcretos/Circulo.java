package MetodoFabrica.productosConcretos;

import MetodoFabrica.abstracciones.Producto;

public class Circulo extends Producto {

	private int radio;

	public Circulo(){
		name = "Circulo Tipo Aleatorio";
		barCode = "";
		radio = (int) (Math.random()*10 + 1);
	}
	
	@Override
	public String operacion() {
		return name + "\nRadio: " + radio + "\nArea: " 
					+ (Math.pow(radio, 2)*Math.PI) +   "\n*******\n";
	}

}
