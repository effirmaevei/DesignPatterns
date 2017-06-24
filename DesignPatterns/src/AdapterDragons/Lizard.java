package AdapterDragons;

/**
 * This is the legacy entity.
 * This class represent a lizard.
 * As you may guess, this class doesn't intend to represent Dragons...
 * 
 * Since it would be nice to avoid changing the internal code 
 * then, you may use an adapter instead if you ever wanted to 
 * use lizards as dragons.
 * 
 * Please do not abuse of your lizards.
 * 
 * @author Jose Manuel Ferreira Benavides
 *
 */
public abstract class Lizard{
	
	public String type;
	
	public void restByTheSun() {
		System.out.println("Peacefully resting by the sun to increase temperature");
	}
	
	public abstract void tailAttack();	
	public abstract void run();	
	public abstract void bite(int strength);	
	
}