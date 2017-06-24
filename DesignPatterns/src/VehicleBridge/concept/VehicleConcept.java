package VehicleBridge.concept;

import VehicleBridge.implementation.MotorVehicleImp;

public abstract class VehicleConcept {

	protected String type;
	protected MotorVehicleImp motorImp;
	
	public VehicleConcept(MotorVehicleImp imp) {
		this.motorImp = imp;		
	}
	
	public abstract void increaseSpeed();	
	public abstract void start();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n").append(this.type).append(" using ").append(motorImp.getType())
		  .append(" motor with ").append(motorImp.getHorsePower());
		
		return sb.toString();
	}

}
