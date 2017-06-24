package CarVisitor;

public class VehicleIdentifier implements Visitante {

	private String reporte = null;

	public String getReporte() {
		return reporte;
	}

	@Override
	public void visitar(Espacio espacio) {

		switch (espacio.getTipo()) {
		case "Carro":
			identificarCarro(espacio);
			break;
		case "Moto":
			identificarMoto(espacio);
			break;
		default:
			identificarCarro(espacio);
			break;
		}

	}

	private void identificarMoto(Espacio espacio) {
		double x = Math.random() * 4;
		int i = (int) (x);
		String ref = null;

		switch (i) {
		case 0:
			ref = "Yamaha-0" + i * 6;
			break;
		case 1:
			ref = "Suzuki S" + i;
			break;
		case 2:
			ref = "Pulsar 220S";
			break;
		default:
			ref = "AKT 125";
			break;
		}

		reporte = "Moto en la zona " + espacio.id + " es " + ref;
	}

	private void identificarCarro(Espacio espacio) {
		double x = Math.random() * 5;
		int i = (int) (x);
		String ref = null;

		switch (i) {
		case 0:
			ref = "Audi R3";
			break;
		case 1:
			ref = "Camaro SS";
			break;
		case 3:
			ref = "Toyota Prado";
			break;
		case 4:
			ref = "Mazda 3";
			break;
		default:
			ref = "imposible de identificar";
		}

		reporte = "Carro en la zona " + espacio.id + " es " + ref;
	}

}
