package AccessProxy;

import java.util.Date;

/**
 * Actual subject. Creation of this object is not possible for outsiders like
 * Cliente
 * 
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class GestorCentral implements Gestor {

	StringBuilder reporte;

	GestorCentral(Date fechaCreacion) {
		reporte = new StringBuilder().append("\nInicialización:")
				.append("\n Proxy: " + fechaCreacion)
				.append("\n Gestor: " + new Date() + "\n");
	}

	@Override
	public void registrarPago(int valor, Date hora) {
		agregarAlReporte(
				"Pago registrado. Valor: " + valor + " | Fecha: " + hora);
	};

	@Override
	public void procesarServicio(Espacio e, Date d) {
		agregarAlReporte("Servicio procesado. Espacio: " + e.id);

	};

	@Override
	public void modificarTarifa(String tipo, int tarifa) {
		agregarAlReporte("Tarifa modificada. La nueva tarifa tipo " + tipo
				+ " es " + tarifa);
	}

	@Override
	public String obtenerReporte() {
		reporte.append("\n\n Generado en: " + new Date());
		return reporte.toString();
	}

	private void agregarAlReporte(String s) {
		reporte.append("\n->").append(s);
	}
}
