package PrototypeChoco;

/**
 * @author Jose Manuel Ferreira Benavides
 *
 */
public abstract class Cubierta {

	protected String color;
	private static int totalInstances = 0;

	public Cubierta() {
		totalInstances++;
	}

	public static int getTotalInstances() {
		return totalInstances;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
