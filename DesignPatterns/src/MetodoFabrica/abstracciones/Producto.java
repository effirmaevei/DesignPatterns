package MetodoFabrica.abstracciones;

/**
 * The abstract class Producto is required to declare the "generic" 
 * type that will be defined by every ConcreteFactory/Creator.
 * 
 * @author Jose Manuel Ferreira Benavides
 *
 */	
public abstract class Producto {

	protected String name;
	protected String barCode;

	/**
	 * The Pokedex object calls this. It is not part of Factory Method. For demo
	 * purposes.
	 * 
	 * @return
	 */
	public abstract String operacion();

}
