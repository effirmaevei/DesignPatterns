package CarVisitor;

public class Demo {	
	/*
	 * client claims ticket
	 * client is granted access
	 * client stores vehicle
	 * 
	 * activate/create visitor (car identifier)
	 * accept(CarIdentifier)  on parking spaces
	 * inner call to identifier prompting him to do his job
	 * identifier has identified vehicle in parking space
	 * print out identified vehicle/ Car Identifier report
	 * 
	 * */
	public static void main(String[] args) {
								
		String[] zonaDisp = {"22C", "04M", "11A", "15M", "10B"};		
		Espacio[] espacios = new Espacio[5];
				
		crearEspacios(espacios, zonaDisp);	
		
		//Los estados pasaraon a estar ocupados (llegaron clientes)
		espacios[0].actualizarEstado();
		espacios[1].actualizarEstado();
		espacios[2].actualizarEstado();
				
		//El identificador de carros puede ir a un espacio
		//e identificar cual es el vehiculo parqueado
		//con un algoritmo aleatorio
		Visitante visitante = new VehicleIdentifier();	
		
		//Ejecución de la operacion del visitante sobre la estructura de datos
		System.out.println("El visitante esta identificando los vehiculos...\n");
		for (Espacio e: espacios) {			
			e.accept(visitante);		
			System.out.println(visitante.getReporte());										
		}								
		
	}
	
	static void crearEspacios(Espacio[] eContainer, String[] zonaDisp){		
		eContainer[0] = new Espacio(zonaDisp[0]);
		eContainer[1] = new Espacio(zonaDisp[1]);
		eContainer[2] = new Espacio(zonaDisp[2]);
		eContainer[3] = new Espacio(zonaDisp[3]);
		eContainer[4] = new Espacio(zonaDisp[4]);
			
	}
}
