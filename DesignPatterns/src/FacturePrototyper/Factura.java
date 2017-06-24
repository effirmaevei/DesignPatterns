package FacturePrototyper;

import java.text.SimpleDateFormat;

/**
 * @author Jose Manuel Ferreira Benavides
 *
 */
public abstract class Factura {

	protected static int totalCreadas = 0;
	protected int id;
	protected String zona;
	protected char tipoZona;
	protected String entrada, salida;
	protected String tiempoServicio;   //in hours
	protected String costoServicio;
	protected String empresa;
	
	public Factura() {
		totalCreadas++;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}
	
	public void setTiempoServicio(String tiempoServicio) {
		this.tiempoServicio = tiempoServicio;
	}

	public void setCostoServicio(String costoServicio) {
		this.costoServicio = costoServicio;
	}

	@Override
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm");

		
		return "Factura " + id + "\nempresa=" + empresa + ", zona=" + zona + ", tipoZona=" + tipoZona
				+ ", \nentrada=" + entrada + ", \nsalida=" + salida
				+ ", \ntiempoServicio=" + tiempoServicio + ", costoServicio="
				+ costoServicio;
	}	
}
