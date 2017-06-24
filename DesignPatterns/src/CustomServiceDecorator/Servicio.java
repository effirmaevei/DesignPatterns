package CustomServiceDecorator;

import java.util.Date;

public abstract class Servicio {

	protected String tipoServicio;
	protected int costoExtra;
	protected int tarifaBaseHora;
	protected String zonaServicio;
	protected Date fechaEntrada;

	public String getTipoServicio() {	return tipoServicio;	}

	public int getCostoExtra() {	return costoExtra;	}
	public int getTarifaBaseHora() {	return tarifaBaseHora;	}
	
	public String getZonaServicio() {	return zonaServicio;	}
	
	public String getFechaEntrada() {	return fechaEntrada.toString();	}
	
	@Override
	public String toString() {
		
		return  "\nTipo Servicio: " + getTipoServicio()  
				+ "\nTarifa Hora: " + getTarifaBaseHora()
				+ "\nFecha entrada: " + getFechaEntrada()
				+ "\nZona Servicio: " + getZonaServicio()
				+ "\nCosto extra: " + getCostoExtra();				
	}
}
