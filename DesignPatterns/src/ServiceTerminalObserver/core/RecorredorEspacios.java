package ServiceTerminalObserver.core;

import java.util.List;

public class RecorredorEspacios<T> implements IRecorredor<T> {

	private List<T> listaEspacios;

	private int currentPos;

	public RecorredorEspacios(List<T> listaEspacios) {
		this.listaEspacios = listaEspacios;
	}

	@Override
	public boolean hasNext() {
		return !(currentPos >= listaEspacios.size()
				|| listaEspacios.get(currentPos) == null);
	}

	@Override
	public T next() {
		T item = listaEspacios.get(currentPos);
		currentPos++;
		return item;
	}

	@Override
	public void volverAlPrimero() {
		currentPos = 0;
	}

}
