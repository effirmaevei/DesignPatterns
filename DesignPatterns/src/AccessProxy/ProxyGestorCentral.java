package AccessProxy;

import java.util.Date;

public class ProxyGestorCentral implements Gestor {

	GestorCentral controlCentral;
	String clave;
	Date fechaCreacion;

	public ProxyGestorCentral(String clave) {
		this.clave = clave;
		// Registro de la fecha en la que se crea el proxy
		fechaCreacion = new Date();
	}

	public boolean autenticar(String pass) {
		if (clave.equals(pass)) {
			controlCentral = new GestorCentral(fechaCreacion);
			return true;
		} else
			return false;
	}

	@Override
	public void registrarPago(int valor, Date hora) {
		if (controlCentral != null)
			controlCentral.registrarPago(valor, hora);

	};

	@Override
	public void procesarServicio(Espacio e, Date d) {
		if (controlCentral != null)
			controlCentral.procesarServicio(e, d);

	};

	@Override
	public void modificarTarifa(String tipo, int tarifa) {
		if (controlCentral != null)
			controlCentral.modificarTarifa(tipo, tarifa);
	}

	@Override
	public String obtenerReporte() {
		if (controlCentral != null)
			return controlCentral.obtenerReporte();
		else
			return "Acceso denegado. " + "Usuario no autenticado. "
					+ "Imposible obtener reporte.";
	}
}
