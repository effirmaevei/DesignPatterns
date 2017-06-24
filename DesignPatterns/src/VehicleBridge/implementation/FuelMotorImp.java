package VehicleBridge.implementation;

public class FuelMotorImp extends MotorVehicleImp {

	public FuelMotorImp() {
		type = "Fuel based";
		horsePower = "200hp";		
	}
	 
	@Override
	public void turnOn() {
		System.out.println("->Starting engine... \n->Generating sparks... "
							+ "\n->Handling primal combustion...");
	}

	@Override
	public void increaseSpeed() {
		System.out.println("->Flow of fuel increased to speed up by 5km/hr");
	}

}
