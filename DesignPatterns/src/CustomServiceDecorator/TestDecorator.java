package CustomServiceDecorator;

public class TestDecorator {

	public static void main(String[] args) {

		System.out.println("---------\nSimulacion de entrada de clientes "
				+ "y subsecuente generacion de servicios de parqueo"
				+ "a traves de generacion de tickets de servicio\n"
				+ "---------");

		Servicio service = new ServicioBase("32A");
		System.out.println(service);

		service = new ServicioLavado(service);
		System.out.println(service);

		service = new ServicioMecanico(service);
		System.out.println(service);

		service = new ServicioLoteria(service);
		System.out.println(service);
	}

}
