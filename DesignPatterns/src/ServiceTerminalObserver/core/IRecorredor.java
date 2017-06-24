package ServiceTerminalObserver.core;

public interface IRecorredor<T> {
	public boolean hasNext();

	public T next();

	public void volverAlPrimero();
}
