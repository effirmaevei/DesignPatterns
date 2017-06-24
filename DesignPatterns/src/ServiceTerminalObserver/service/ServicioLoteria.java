package ServiceTerminalObserver.service;

public class ServicioLoteria extends ServicioDecorado {

	public ServicioLoteria(Servicio serv) {
		this.servicio = serv;
		this.tipoServicio = "Loteria";
		this.costoExtra = 1000; 
		this.tarifaBaseHora = -3;
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
