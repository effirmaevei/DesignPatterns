package IteratorSpaceHandler;

import java.util.ArrayList;
import java.util.List;

public class ColeccionEspacios implements Coleccion<Espacio> {

	private List<Espacio> listaEspacios;
	private IRecorredor<Espacio> mIterador;

	public ColeccionEspacios() {
		listaEspacios = new ArrayList<>();
		mIterador = iterador();
	}

	public ColeccionEspacios(List<Espacio> coleccion) {
		listaEspacios = coleccion;
		mIterador = iterador();
	}

	public void agregarEspacio(Espacio e) {
		listaEspacios.add(e);
	}

	@Override
	public IRecorredor<Espacio> iterador() {
		if (mIterador != null) {
			mIterador.volverAlPrimero();
			return mIterador;
		} else {
			return new RecorredorEspacios<Espacio>(listaEspacios);
		}
	}

}
