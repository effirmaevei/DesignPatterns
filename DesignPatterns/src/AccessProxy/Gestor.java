package AccessProxy;
import java.util.Date;

public abstract interface Gestor {
	/**Registra una transacción que ocurrio en la fecha dada con 
	 * el valor de entrada. */
	public abstract void registrarPago(int valor, Date hora);
	
	/**Encargada de las operaciones que ocurren al atender un cliente que presenta su
	 * ticket con el fin de retirar su vehiculo.	*/
	public abstract void procesarServicio(Espacio e, Date d);
	
	/**Actualiza la tarifa asociada al servicio del tipo especifica con el valor tarifa */
	public abstract void modificarTarifa(String tipo, int tarifa);
	
	/**Provee el reporte completo de operaciones procesadas por el gestor en una cadena*/
	public abstract String obtenerReporte();
}
