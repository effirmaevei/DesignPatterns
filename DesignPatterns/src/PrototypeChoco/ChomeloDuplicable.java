package PrototypeChoco;

/**
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class ChomeloDuplicable extends Chomelo implements IDuplicable {

	/**
	 * Public constructor
	 */
	public ChomeloDuplicable(String relleno) {
		this.relleno = relleno;
	}

	private ChomeloDuplicable(ChomeloDuplicable ref) {
		this.relleno = ref.getRelleno();
	}

	@Override
	public Chomelo duplicate() {
		return new ChomeloDuplicable(this);
	}

}
