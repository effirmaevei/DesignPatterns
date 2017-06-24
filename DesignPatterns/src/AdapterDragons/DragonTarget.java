package AdapterDragons;

/**
 * This is the target for the Adapter Demo. This is what the 
 * client was told he would have access to.
 * 
 * Normally we would want to have a Dragon being referenced
 * when the client uses this interface methods. However,
 * should be we be short in dragons; we intend to provisionally 
 * replace the Dragon with other reptiles (Lizard) through an adapter.
 * 
 * This is also an interface that establishes the expected internal behavior
 * of a dragon. Every dragon should implement it.
 * 
 * @author Jose Manuel Ferreira Benavides
 *
 */
public interface DragonTarget{
	
	public abstract void spitFire();	
	
	public abstract void tailSweep();
	public abstract void fly();	
	public abstract void run();	
	public abstract void draconicBite();	
	
	public abstract void about();
	
}