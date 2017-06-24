package AccessProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DemoProxy {

	public static void main(String[] args)
			throws NumberFormatException, ParseException, InterruptedException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm");

		ProxyGestorCentral proxyCentral = new ProxyGestorCentral(
				"codigo secreto");

		// Solo con autenticación es posible crear el objeto real y acceder a el

		proxyCentral.autenticar("clave secreta");
		proxyCentral.modificarTarifa("Carro", 5000);
		// in: Cobro - FechaHora
		proxyCentral.registrarPago(20000, dateFormat.parse("03-10-2013 20:10"));
		// in: idEspacio - FechaHora
		proxyCentral.procesarServicio(new Espacio("32A"),
				dateFormat.parse("05-20-2015 09:15"));
		System.out.println(proxyCentral.obtenerReporte());
		Thread.sleep(1000);

		// -------------------------------------------------//

		proxyCentral.autenticar("codigo secreto");
		proxyCentral.modificarTarifa("Carro", 5000);
		proxyCentral.modificarTarifa("Moto", 2000);
		proxyCentral.registrarPago(20000, dateFormat.parse("03-10-2013 20:10"));
		proxyCentral.registrarPago(4000, dateFormat.parse("03-10-2013 21:15"));
		proxyCentral.procesarServicio(new Espacio("32A"),
				dateFormat.parse("05-20-2015 09:15"));
		proxyCentral.procesarServicio(new Espacio("02A"),
				dateFormat.parse("05-20-2015 09:15"));

		System.out.println(proxyCentral.obtenerReporte());

	}
}
