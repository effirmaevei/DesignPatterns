package CarBuilder;

public abstract class CarBuilder {

	/* PROTECTED reference to the product to be used by the concrete builders */
	protected Car car;
	
	
	/* PROTECTED Fields required for object construction */
	protected String customer;
	protected String type;
	
	// The get product method meant to retrieve the finished product. 
	public Car getCar(){
		return car;
	}
	
	// A method to create a new empty object to be built. Like a container.
	public void createNewCar(){
		car = new Car(customer, type);
	}
	
	// Abstract methods to be defined in concrete factories. 
	// Normally, one for each part of the product.
	public abstract void buildFuelContainer();
	public abstract void buildEngine();
	public abstract void buildSeats();
	public abstract void buildWheels();
	
}
