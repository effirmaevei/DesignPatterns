package CarBuilder;

public class Car {
	 
	/*
	  * Scissor, Sliding, Regular
	  * V8, V12, H16-BRM, W16
	  * Off-road, City, Drag-Race
	  * Fuel: Diesel, Autogas, Electric, Hydrogen
	  * Wheels: 2,3,4,6
	  * Truck, mini, convertible, formula1
	 */
	
	private String customer = "NAN";
	private String type = "NAN";		
	private String engineType = "";
	private String fuelType = "";
	private int numSeats = -1;
	private int numWheels = -1;
	//private String doorType;
	//private String tiresType;
	
	/* 
	 * Constructor, may or may not take arguments given by the factory and the client 
	 * through the director. This arguments exist as protected in the abstract builder.
	 */
	public Car(String customer, String type){
		this.customer = customer;
		this.type = type;
	}
	
	public void setEngineType(String engineType){
		this.engineType = engineType;
	}
	
	public void setFuelType(String fuelType){
		this.fuelType = fuelType;
	}
	
	public void setNumSeats(int numSeats){
		this.numSeats = numSeats;
	}
	
	public void setNumWheels(int numWheels){
		this.numWheels = numWheels;
	}

	public String getCustomer() {
		return customer;
	}

	public String getType() {
		return type;
	}
	
}
