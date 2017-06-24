package ServiceTerminalObserver.service;

public abstract class ServicioDecorado extends Servicio {

	protected Servicio servicio;
	
	@Override
	public int getTarifaBaseHora() {
		return servicio.getTarifaBaseHora();
	}
	
	@Override
	public String getZonaServicio() {
		return servicio.getZonaServicio();
	}
	
	@Override
	public String getFechaEntrada() {
		return servicio.getFechaEntrada();
	}
	
	public abstract String getTipoServicio();
	
	public abstract int getCostoExtra();


	
	
	
	
}
