package VehicleBridge.concept;

import VehicleBridge.implementation.MotorVehicleImp;

public class BoatConcept extends VehicleConcept {

	public BoatConcept(MotorVehicleImp imp) {
		super(imp);
		type = "Boat";				
	}

	@Override
	public void increaseSpeed() {
		motorImp.increaseSpeed();
	}

	@Override
	public void start() {
		motorImp.turnOn();
	}

}
