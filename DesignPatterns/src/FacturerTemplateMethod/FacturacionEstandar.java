package FacturerTemplateMethod;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FacturacionEstandar extends Facturacion {

	@Override
	protected Date deducirFechaEntrada(String[] in) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm");
		Date date = null;
		try {
			date = sdf.parse(in[0] + " " + in[1]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;

	}

	@Override
	protected double calcularHoras(Date dt) {
		Date rightNow = new Date();
		double horas = (rightNow.getTime() - date.getTime()) / (1000 * 3600);
		return horas;
	}

	@Override
	protected int calcularCostoServicio(double d) {
		int TARIFA = 2000;

		if (horas > 1) {
			return (int) (TARIFA * d);
		}
		return TARIFA;

	}

	@Override
	protected String identificarZona(String[] in) {
		return in[2];
	}

	@Override
	protected boolean verificarAutenticidadTicket(String[] in) {
		// Politica de manejo: No hay presupuesto para verificar autenticidad.
		return true;
	}

}
