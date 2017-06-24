package FacturerTemplateMethod;
import java.util.Date;

public abstract class Facturacion {

	Date date = null;
	double horas;
	double costo;
	String zona;

	protected abstract Date deducirFechaEntrada(String[] in);

	protected abstract double calcularHoras(Date dt);

	protected abstract int calcularCostoServicio(double d);

	protected abstract String identificarZona(String[] in);

	protected abstract boolean verificarAutenticidadTicket(String[] in);

	public final Factura construirFactura(String[] in) {
		if (verificarAutenticidadTicket(in)) {
			setFecha(deducirFechaEntrada(in));
			setHoras(calcularHoras(this.date));
			costo = calcularCostoServicio(this.horas);
			zona = identificarZona(in);
			return new Factura(date, (int) horas, (int) costo, zona);
		} else {
			System.out.println(
					"El ticket no es autentico. Imposible generar factura");
			return null;
		}

	}

	private final void setHoras(double d) {
		this.horas = d;
	}

	private final void setFecha(Date da) {
		this.date = da;
	}
}
