package ServiceTerminalObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ServiceTerminalObserver.core.Espacio;
import ServiceTerminalObserver.gestor.Gestor;
import ServiceTerminalObserver.gestor.GestorRecursos;
import ServiceTerminalObserver.gestor.TerminalObservador;
import ServiceTerminalObserver.service.Servicio;

public class Demo {

	public static void main(String[] args) {

		List<Espacio> espacios = new ArrayList<>();
		generarEspacios(espacios, 5);

		GestorRecursos gestorRecursos = new GestorRecursos(espacios);
		Iterator<Espacio> it = gestorRecursos.getEspaciosLibres().iterator();
		TerminalObservador terminal = new TerminalObservador(gestorRecursos);
		
		gestorRecursos.registrarObservador(terminal);
		gestorRecursos.actualizarServiciosExtra(true, true, false);
		
		imprimirLibres(gestorRecursos, it);

		System.out.println("\n->El primer usuario elije los 3 servicios."
				+ " Solo hay 2 disponibles.");
		String[] peticion1 = { "Lavado", "Mecanico", "Loteria" };
		procesar(peticion1, terminal);

		System.out.println("\n->Un segundo usuario elije 1 servicio.");
		procesar(new String[]{"Lavado"}, terminal);

		System.out.println("\n->Un tercer usuario no elije servicios extra");		
		procesar(new String[]{""}, terminal);	
		imprimirLibres(gestorRecursos, it);

		System.out.println(
				"\nEl espacio 2A es liberado y pasa a la cola de disponibles");
		gestorRecursos.modificarEspacio(2);		
		imprimirLibres(gestorRecursos, it);

		System.out.println("\nLuego, un nuevo cliente es atendido normalmente");
		procesar(new String[]{""}, terminal);
		imprimirLibres(gestorRecursos, it);

	}

	static void procesar(String[] peticion, TerminalObservador obs) {
		Servicio s1 = obs.procesarPeticion(peticion);
		if (s1 == null) {
			System.out.println("Tickete y servicio "
					+ "no generado. Todos los espacios estan ocupados");
		} else System.out.println(s1);
	}
	
	static void imprimirLibres(Gestor gestorRecursos, Iterator<Espacio> it){
		System.out.println("\n---Espacios Libres--- ");
		it = gestorRecursos.getEspaciosLibres().iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

	static void generarEspacios(List<Espacio> espacios, int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			Espacio e = new Espacio(String.valueOf(i) + "A");
			// if(i%2==0) e.actualizarEstado(); //todos disponibles
			espacios.add(e);
		}
	}
}
