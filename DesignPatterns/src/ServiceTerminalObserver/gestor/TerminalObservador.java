package ServiceTerminalObserver.gestor;

import ServiceTerminalObserver.core.Coleccion;
import ServiceTerminalObserver.core.ColeccionEspacios;
import ServiceTerminalObserver.core.Espacio;
import ServiceTerminalObserver.core.IRecorredor;
import ServiceTerminalObserver.service.Servicio;
import ServiceTerminalObserver.service.ServicioBase;
import ServiceTerminalObserver.service.ServicioLavado;
import ServiceTerminalObserver.service.ServicioLoteria;
import ServiceTerminalObserver.service.ServicioMecanico;

/**
 * The abstraction of an object that must keep its state synchronized with
 * <code>Gestor</code>.
 * 
 * The state of objects of type <code>ObservadorRecursos</code> have a distinct
 * state that allows them to
 * 
 * 
 * @author Jose Manuel Ferreira Benavides
 */
public class TerminalObservador {

	GestorRecursos gestor;

	private boolean[] serviciosExtra;
	private Coleccion<Espacio> espaciosLibres;
	private String textoServiciosExtra;
	IRecorredor<Espacio> it;
	private Espacio actualLibre;

	public TerminalObservador(GestorRecursos gestor) {
		espaciosLibres = new ColeccionEspacios(gestor.getEspaciosLibres());
		it = espaciosLibres.iterador();
		this.gestor = gestor;
	}

	public void renovarEspaciosLibres() {
		espaciosLibres = new ColeccionEspacios(gestor.getEspaciosLibres());
		it.volverAlPrimero();
	}

	public void renovarServiciosExtra() {
		this.serviciosExtra = gestor.getServiciosExtra();
	}

	public void generarTextoServiciosExtra() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nServicios extra disponibles: ");

		if (serviciosExtra[GestorRecursos.I_SERVICIO_LOTERIA]) {
			sb.append("\t-Entrada de Loteria");
		}
		if (serviciosExtra[GestorRecursos.I_SERVICIO_LAVADO]) {
			sb.append(" -Lavado");
		}
		if (serviciosExtra[GestorRecursos.I_SERVICIO_MECANICO]) {
			sb.append(" -Revisión mecánica");
		}

		textoServiciosExtra = sb.toString();
	}

	public Servicio procesarPeticion(String[] serviciosExtra) {
		if (it.hasNext()) {
			actualLibre = it.next();
			Servicio serv = new ServicioBase(actualLibre.getId());

			for (int i = 0; i < serviciosExtra.length; i++) {
				switch (serviciosExtra[i]) {
				case "Lavado":
					if (this.serviciosExtra[GestorRecursos.I_SERVICIO_LAVADO]) {
						serv = new ServicioLavado(serv);
					}
					break;
				case "Mecanico":
					if (this.serviciosExtra[GestorRecursos.I_SERVICIO_MECANICO]) {
						serv = new ServicioMecanico(serv);
					}
					break;
				case "Loteria":
					if (this.serviciosExtra[GestorRecursos.I_SERVICIO_LOTERIA]) {
						serv = new ServicioLoteria(serv);
					}
					break;
				default:
					break;
				}
			}

			actualLibre.actualizarEstado();
			return serv;

		} else {
			System.out.println("Tickete y servicio no generado. "
					+ "Todos los espacios estan ocupados");
			return null;
		}
	}

	public String getTextoServiciosExtra() {
		generarTextoServiciosExtra();
		return textoServiciosExtra;
	}
}
