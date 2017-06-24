package VehicleBridge.implementation;

public abstract class MotorVehicleImp {

	protected String type;
	protected String horsePower;
	
	public abstract void turnOn();		
	public abstract void increaseSpeed();
	
	public String getType() {
		return type;
	}
	public String getHorsePower() {
		return horsePower;
	}

	
	
}
