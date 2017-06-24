package Singleton;

/**
 * This class uses singleton pattern to avoid having more than one instance at
 * any given time.
 * 
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class SingletonZeus {

	/*
	 * 'instance' holds a reference at all times (being static) to the unique
	 * instance of SingletonZeus
	 * 
	 */
	private static SingletonZeus instance;

	private int humanRequestsTaken = 0;
	private int numberOfShrines = 0;
	private final String name = "Zeus, God of the Olympus";

	/*
	 * A private constructor avoids creation of instances outside of this class,
	 * ensuring the one and only instance in existence is the one created by the
	 * method getInstance.
	 */
	private SingletonZeus() {
	}

	public int getHumanRequestsTaken() {
		return humanRequestsTaken;
	}

	public void setHumanRequestsTaken(int newRequests) {
		this.humanRequestsTaken += newRequests;
	}

	public int getNumberOfShrines() {
		return numberOfShrines;
	}

	public void setNumberOfShrines(int numberOfShrines) {
		this.numberOfShrines = numberOfShrines;
	}

	public String getName() {
		return name;
	}

	/**
	 * Method defined a synchronized block to ensure getInstance() is
	 * thread-safe. This method is in charge of handling requests from anyone
	 * who wants to use the class.
	 * 
	 * @return
	 */
	public static synchronized SingletonZeus getInstance() {
		if (instance == null) {
			instance = new SingletonZeus();
		}
		return instance;
	}

}
