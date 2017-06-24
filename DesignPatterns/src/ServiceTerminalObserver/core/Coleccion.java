package ServiceTerminalObserver.core;

public interface Coleccion<T> {
	public IRecorredor<T> iterador();

	public void agregarEspacio(T t);
}
