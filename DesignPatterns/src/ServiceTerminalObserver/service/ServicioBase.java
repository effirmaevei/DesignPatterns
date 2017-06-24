package ServiceTerminalObserver.service;

import java.util.Date;

public class ServicioBase extends Servicio{
	
	public ServicioBase(String zonaSvc) {
		tipoServicio = "Parqueo básico";
		tarifaBaseHora = 3000;
		costoExtra = 0;
		zonaServicio = zonaSvc;
		fechaEntrada = new Date();
	}
	
}
