package CarBuilder;
public class DemoBuilder {

	public static void main(String[] args) {

		// Instantiate the director (hire the engineer, manager)
		Director concesionario = new Director();

		// instantiate each concrete builder (take orders).
		// Variations of this pattern may not require parameters
		CarBuilder isseta0Builder = new Isseta300("German Billonaire");
		CarBuilder truckBuilder = new BMWTruck("FEDEX");

		// build your products
		concesionario.setCarBuilder(isseta0Builder);
		concesionario.constructCar();
		Car isseta = concesionario.getCar(); // Holds a small car

		concesionario.setCarBuilder(truckBuilder);
		concesionario.constructCar();
		Car bigTruck = concesionario.getCar(); // Holds a truck

		// display them
		System.out.println(
				isseta.getType() + " is completed and ready for delivery to "
						+ isseta.getCustomer());
		System.out.println(
				bigTruck.getType() + " is completed and ready for delivery to "
						+ bigTruck.getCustomer());

	}
}
