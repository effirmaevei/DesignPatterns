package VehicleBridge.implementation;

public class ElectricMotorImp extends MotorVehicleImp{
	
	public ElectricMotorImp() {
		type = "Electric";
		horsePower = "100hp";		
	}

	@Override
	public void turnOn() {
		System.out.println("->Turning on electric motor...");
	}

	@Override
	public void increaseSpeed() {
		System.out.println("->Speed has been increased by 5 miles per hour");
	}

}
