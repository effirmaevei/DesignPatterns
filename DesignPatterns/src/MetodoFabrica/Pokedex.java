package MetodoFabrica;
import MetodoFabrica.abstracciones.Producto;

/* Esta clase no es parte del metodo fabrica, sino la solucion a la 
 * perticion del profesor de un objeto que pudiese "leer" el metodo de todos
 * los demas objetos (como una balance que lee peso o una pokedex).
 */
public class Pokedex {

	public static void analyze(Producto p){
		
		System.out.println(p.operacion());
	}
	
}
