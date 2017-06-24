package ServiceTerminalObserver.gestor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ServiceTerminalObserver.core.Coleccion;
import ServiceTerminalObserver.core.ColeccionEspacios;
import ServiceTerminalObserver.core.Espacio;
import ServiceTerminalObserver.core.IRecorredor;

public class GestorRecursos implements Gestor {

	final public static int I_SERVICIO_LOTERIA = 0;
	final public static int I_SERVICIO_LAVADO = 1;
	final public static int I_SERVICIO_MECANICO = 2;

	private boolean[] serviciosExtra = { false, false, false };
	private List<Espacio> espacios = new ArrayList<>();
	private List<Espacio> espaciosLibres = new ArrayList<>();
	private List<TerminalObservador> obs = new ArrayList<>();

	public GestorRecursos(List<Espacio> espacios) {
		this.espacios = espacios;
		seleccionarEspaciosLibres(espacios);
	}

	@Override
	public void actualizarServiciosExtra(boolean loteria, boolean lavado,
			boolean mecanico) {
		serviciosExtra[I_SERVICIO_LOTERIA] = loteria;
		serviciosExtra[I_SERVICIO_LAVADO] = lavado;
		serviciosExtra[I_SERVICIO_MECANICO] = mecanico;

		for (TerminalObservador ob : obs) {
			ob.renovarServiciosExtra();
		}

	}

	/**
	 * Updates the collection that keeps track of all parking spaces the program
	 * handles. It also updates the observer which is meant to keep track of all
	 * available spaces.
	 */
	@Override
	public void modificarEspacio(int... indices) {
		
		for (int i = 0; i < indices.length; i++) {
			Espacio e = espacios.get(indices[i]);	

			
			if(e.ocupado()){
				e.actualizarEstado();		

				espaciosLibres.add(e);
			}

		}
		
		for (TerminalObservador ob : obs) {
			ob.renovarEspaciosLibres();
		}
	}

	private void seleccionarEspaciosLibres(List<Espacio> espacios) {
		for (Espacio esp : espacios) {
			if(!esp.ocupado()){
				espaciosLibres.add(esp);
			}else{
				espaciosLibres.remove(esp);
			}
		}
	}
	
	private void refinarLibres(List<Espacio> espacios) {
				
		for (Iterator iterator = espacios.iterator(); iterator.hasNext();) {
			Espacio espacio = (Espacio) iterator.next();
			if(espacio.ocupado()){
				iterator.remove();
			}
		}
	}

	@Override
	public List<Espacio> getEspacios() {
		return espacios;
	}

	@Override
	public List<Espacio> getEspaciosLibres() {
		refinarLibres(espaciosLibres);
		return espaciosLibres;
	}

	@Override
	public boolean[] getServiciosExtra() {
		return serviciosExtra;
	}

	@Override
	public void registrarObservador(TerminalObservador ob) {
		obs.add(ob);
	}
}
