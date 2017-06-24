package CustomServiceDecorator;

public class ServicioLavado extends ServicioDecorado {

	public ServicioLavado(Servicio serv) {
		this.servicio = serv;
		this.tipoServicio = "Lavado";
		this.costoExtra = 3000; 
		this.tarifaBaseHora = -2;
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
