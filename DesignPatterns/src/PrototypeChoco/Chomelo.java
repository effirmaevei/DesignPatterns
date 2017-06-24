package PrototypeChoco;

/**
 * @author Jose Manuel Ferreira Benavides
 *
 */
public abstract class Chomelo {

	protected String relleno;
	private static int totalInstances = 0;

	public Chomelo() {
		// Triggered when new is used in ChomeloDuplicable
		// System.out.println(relleno + color);
		totalInstances++;
	}

	public static int getTotalInstances() {
		return totalInstances;
	}

	public String getRelleno() {
		return relleno;
	}

	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}

}
