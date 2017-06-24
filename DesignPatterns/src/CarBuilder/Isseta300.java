package CarBuilder;

public class Isseta300 extends CarBuilder {

	public Isseta300(String customer){
		super.customer = customer;
		super.type = "BMW Isseta 300";
	}
	
	@Override
	public void buildFuelContainer() {
		car.setFuelType("Electric");
	}

	@Override
	public void buildEngine() {
		car.setEngineType("300cc 13hp-5200rpm");
	}

	@Override
	public void buildSeats() {
		car.setNumSeats(2);
	}

	@Override
	public void buildWheels() {
		car.setNumWheels(3);
	}

}
