package PrototypeChoco;

/**
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class CubiertaDuplicable extends Cubierta implements IDuplicable {

	/**
	 * 
	 */
	public CubiertaDuplicable(String color) {
		this.color = color;
	}

	private CubiertaDuplicable(CubiertaDuplicable ref) {
		this.color = ref.getColor();
	}

	@Override
	public Cubierta duplicate() {
		return new CubiertaDuplicable(this);
	}

}
