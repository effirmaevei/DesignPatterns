package AdapterDragons;

/**
 * This is the legacy entity.
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class KomodoDragon extends Lizard{

	protected int maxRunDistance = 100;
	
	public KomodoDragon() {		
		type = "Komodo Dragon";
		System.out.println("\n" + type + " has been created");
	}

	@Override
	public void tailAttack() {
		System.out.println("Fiercely attacking with the tail");
	}

	@Override
	public void run() {
		System.out.println("Runned " + maxRunDistance + " mts");
	}

	@Override
	public void bite(int strength) {	
		String qualifier = (strength>10?((strength>50)?"super hard":"very hard"):"");
		System.out.println("Bitting " + qualifier);
	}
}
