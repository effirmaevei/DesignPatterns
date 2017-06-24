package CarVisitor;

public class Espacio {

	final static int OCUPADO = 1;
	final static int DISPONIBLE = 10;

	protected int estadoOculto;
	protected String estado;
	protected String id;
	protected String tipo;

	public Espacio(String id) {
		this.id = id;
		estadoOculto = DISPONIBLE;
		estado = "Disponible";
		deducirTipo(id);
	}

	public final void actualizarEstado() {
		if (estadoOculto == DISPONIBLE) {
			estadoOculto = OCUPADO;
			estado = "Ocupado";
		} else {
			estadoOculto = DISPONIBLE;
			estado = "Disponible";
		}
	}

	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean ocupado() {
		return (estadoOculto == OCUPADO);
	}

	private void deducirTipo(String id) {
		String letra = id.toLowerCase().replaceAll("\\P{L}+", "");
		switch (letra) {
		case "c":
			tipo = "Carro";
			break;
		case "m":
			tipo = "Moto";
			break;
		case "b":
			tipo = "Moto";
			break;
		case "a":
			tipo = "Carro";
			break;
		case "o":
			tipo = "Bicicleta";
		default:
			tipo = "Carro";
			break;
		}
	}

	public void accept(Visitante visit) {
		visit.visitar(this);
	}

	@Override
	public String toString() {
		return "Espacio de parqueo: " + id + "\t " + estado;
	}
}