package MetodoFabrica.abstracciones;

public abstract class Fabrica {
	
	/**
	 * Param type
	 */
	public abstract Producto fabricarProducto(String type);
	//public abstract Producto fabricarProducto(Object... especificaciones);
}
