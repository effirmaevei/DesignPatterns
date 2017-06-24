package CarBuilder;

public class BMWTruck extends CarBuilder{

	public BMWTruck(String customer){
		super.customer = customer;
		super.type = "6 Wheel Off-Road Truck";
	}
	
	@Override
	public void buildFuelContainer() {
		car.setFuelType("Diesel");
	}

	@Override
	public void buildEngine() {
		car.setEngineType("V4 Modelo 2000");
	}

	@Override
	public void buildSeats() {
		car.setNumSeats(2);
	}

	@Override
	public void buildWheels() {
		car.setNumWheels(6);
	}

}
