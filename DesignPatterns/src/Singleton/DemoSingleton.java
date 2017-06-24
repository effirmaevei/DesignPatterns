package Singleton;

/**
 * The singleton pattern is used to restrict the number of instances of a class
 * to a single one. There are contexts were this feature may be desired, such
 * as, if you are modeling something that is meant to be one of a king... Jesus,
 * God, Zeus, Your bank account ID, the president of Colombia, etc.
 * 
 * @author Jose Manuel Ferreira Benavides
 *
 */
public class DemoSingleton {

	public static void main(String[] args) {

		/*
		 * Regardless of access point, SingletonZeus hold the same data across
		 * all places where it is be used.
		 */
		SingletonZeus.getInstance().setHumanRequestsTaken(100);
		SingletonZeus.getInstance().setNumberOfShrines(10);

		System.out.println("*********** Singleton Pattern Demo ******** ");
		System.out.println("Zeus has a total of: "
				+ SingletonZeus.getInstance().getNumberOfShrines() + " shrines"
				+ " and has taken "
				+ SingletonZeus.getInstance().getHumanRequestsTaken()
				+ " requests from humans." + " His full name is: "
				+ SingletonZeus.getInstance().getName());

	}

}
