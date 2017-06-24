package CustomServiceDecorator;

public class ServicioMecanico extends ServicioDecorado{

	public ServicioMecanico(Servicio serv) {		
		this.servicio = serv;
		this.tipoServicio = "Revisión Mecánica";
		this.costoExtra = 5000; 
		this.tarifaBaseHora = -7;
	}

	@Override
	public String getTipoServicio() {
		return servicio.getTipoServicio() + " + " + tipoServicio;
	}

	@Override
	public int getCostoExtra() {
		return servicio.getCostoExtra() + costoExtra;
	}
}
