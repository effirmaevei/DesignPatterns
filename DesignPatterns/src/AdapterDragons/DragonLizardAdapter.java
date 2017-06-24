package AdapterDragons;

/**
 * This is an adapter meant to allow the application
 * to provisionally substitute dragons by lizards.
 * This class effectively constitutes a fake-dragon
 * and internally, constitutes a Lizard.
 * 
 * The Adaptee is the type Lizard 
 * The Target is a Dragon.
 * 
 * 
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class DragonLizardAdapter implements DragonTarget{

	Lizard lizard;
	
	public DragonLizardAdapter(Lizard adaptee) {
		System.out.println("\nCreated a fake dragon, errr, 'adapted lizard'");
		lizard = adaptee;
	}

	@Override
	public void tailSweep() {
		lizard.tailAttack();
	}

	@Override
	public void run() {
		lizard.run();
	}

	@Override
	public void draconicBite() {
		lizard.bite(100);
	}
	
	public void about(){
		System.out.println("This class represents a fake-dragon behaviour"
				+ " Internally, IT has a Lizard.");
	}
	
	@Override
	public void spitFire() {
		try{
			throw new UnsupportedOperationException();		
		}catch (UnsupportedOperationException e) {
			System.out.println("Fake dragons can't spit fire");
		}
	}
	
	@Override
	public void fly() {
		try{
			throw new UnsupportedOperationException();		
		}catch (UnsupportedOperationException e) {
			System.out.println("Fake dragons can't fly");
		}
	}
}
