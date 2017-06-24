package ServiceTerminalObserver.gestor;

import java.util.List;

import ServiceTerminalObserver.core.Coleccion;
import ServiceTerminalObserver.core.Espacio;

public interface Gestor {

	void actualizarServiciosExtra(boolean loteria, boolean lavado,
			boolean mecanico);

	List<Espacio> getEspacios();

	List<Espacio> getEspaciosLibres();

	boolean[] getServiciosExtra();

	void modificarEspacio(int... indices);

	void registrarObservador(TerminalObservador ob);

}