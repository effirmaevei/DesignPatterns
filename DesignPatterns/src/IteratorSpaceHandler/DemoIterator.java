package IteratorSpaceHandler;

import java.util.ArrayList;
import java.util.List;

public class DemoIterator {

	public static void main(String[] args) {

		/*-> Definir Entradas: Colecciones
		 * de Espacios -> disponibles y ocupados */

		Coleccion<Espacio> espacios = new ColeccionEspacios();
		List<Espacio> d = new ArrayList<>();
		Coleccion<Espacio> espaciosList = new ColeccionEspacios(d);

		generarEspacios(d, espacios);

		/* -> Procesamiento con Iterador para ubicar -> espacios disponibles  */

		IRecorredor<Espacio> itInput0 = espacios.iterador();
		IRecorredor<Espacio> itInput1 = espaciosList.iterador();

		Coleccion<Espacio> espaciosDisponibles = new ColeccionEspacios();

		System.out.println("\nEspacios fisicos de parqueo: \n");
		seleccionar(itInput0, espaciosDisponibles);
		seleccionar(itInput1, espaciosDisponibles);

		IRecorredor<Espacio> it2 = espaciosDisponibles.iterador();

		System.out.println("\nEspacios disponibles: \n");

		/*-> Impresion en consola de espacios seleccionados  */

		while (it2.hasNext()) {
			Espacio e = it2.next();
			System.out.println(e);
		}
	}

	static void seleccionar(IRecorredor<Espacio> it,
			Coleccion<Espacio> output) {
		while (it.hasNext()) {
			Espacio e = it.next();
			if (!e.ocupado()) {
				output.agregarEspacio(e);
			}
			System.out.println(e);
		}
	}

	static void generarEspacios(List<Espacio> d, Coleccion<Espacio> rawList) {
		d.add(new Espacio("03A"));
		d.add(new Espacio("23A"));
		d.add(new Espacio("09B"));
		d.get(0).actualizarEstado();
		d.get(2).actualizarEstado();

		for (int i = 0; i < 10; i++) {
			Espacio e = new Espacio(String.valueOf(i) + "0A");
			if (i % 2 == 0)	e.actualizarEstado();
			rawList.agregarEspacio(e);
		}
	}

}
