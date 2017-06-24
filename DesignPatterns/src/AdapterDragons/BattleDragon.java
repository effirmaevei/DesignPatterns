package AdapterDragons;

/**
 * An implementation of <code>DragonTarget</code>
 * 
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class BattleDragon implements DragonTarget{

	public BattleDragon() {
		System.out.println("\nCreated a battle dragon");
	}
	
	@Override
	public void spitFire() {
		System.out.println("The mighty fire of the dragon burns you!");
	}
	
	@Override
	public void tailSweep() {
		System.out.println("Dragon tail sweep executed; it did lots of damage.");
	}

	@Override
	public void fly() {
		System.out.println("Flying dominantly");
	}

	@Override
	public void run() {
		System.out.println("Running with dragon style");
	}

	@Override
	public void draconicBite() {
		System.out.println("Bitting with sharp teeth");
	}
	
	public void about(){
		System.out.println("This class represents a battle dragon behaviour."
				+ " Internally, IT IS a dragon.");
	}

}
