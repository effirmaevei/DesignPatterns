package CompositeShipTax;
public class TestTarifa {

	static int tarifaTon = 150; // US DOLLAR
	
	public static void main(String[] args) {

		Componente buqueDeCarga = new BuqueContenedor("Carrier FF", 50);
		Componente barcoMediano = new Embarcacion("Fragata S2", 20);
		Componente barcoPequeño = new Embarcacion("Pesquero Hilly", 5);
		Componente containerA = new MetalContainer(2.3);				
		
		
		buqueDeCarga.agregar(barcoMediano);
		buqueDeCarga.agregar(barcoPequeño);		
		buqueDeCarga.agregar(barcoPequeño);
		buqueDeCarga.agregar(containerA);		
					
		imprimirCobro(buqueDeCarga);
		
		System.out.println("Removiendo 1 Pesquero Hilly");
		buqueDeCarga.remover(barcoPequeño);
		
		imprimirCobro(buqueDeCarga);
		
		System.out.println("Peso de un container: " + 
				buqueDeCarga.getComponente(2).getPeso());
		
		
		//Throws an exception as intended. Client should be stopped if
		//he tries to add components to leafs.
		//barcoMediano.getComponente(2).agregar(buqueDeCarga);
	}
	
	
	public static void imprimirCobro(Componente c){
		StringBuilder sb = new StringBuilder();
		
		
		sb.append("Buque con contenidos:\n")
			.append(listarContenidos(c))
			.append("\nPeso total: ").append(c.getPeso()).append(" toneladas")
			.append("\nCosto de peaje:  ").append(c.getPeso()*tarifaTon)
			.append(" US DOLLAR").append("\n");
		
		System.out.println(sb.toString());
	}
	
	public static String listarContenidos(Componente c){
		int i = 0;
		StringBuilder sb = new StringBuilder();
		try{
			while(true){				
				sb.append("--").append(c.getComponente(i).getTipo()).append("\n");
				i++;
			}
		}catch (Exception e) {
			return sb.toString();
		}
		
	};
	
	
	
	
	
}
