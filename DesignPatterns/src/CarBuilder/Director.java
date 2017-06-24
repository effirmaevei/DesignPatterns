package CarBuilder;

public class Director {
	
	private CarBuilder carBuilder;
	public void setCarBuilder(CarBuilder cb) {
		carBuilder = cb;
	}
	
	public Car getCar() {
		return carBuilder.getCar();
	}
	
	public void constructCar() {
		carBuilder.createNewCar();
		carBuilder.buildEngine();
		carBuilder.buildFuelContainer();
		carBuilder.buildSeats();
		carBuilder.buildWheels();
	}
	
}


