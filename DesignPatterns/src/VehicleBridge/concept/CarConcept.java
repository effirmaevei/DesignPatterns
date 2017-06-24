package VehicleBridge.concept;

import VehicleBridge.implementation.MotorVehicleImp;

public class CarConcept extends VehicleConcept {

	public CarConcept(MotorVehicleImp motorImp) {
		super(motorImp);		
		type = "Car";
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
