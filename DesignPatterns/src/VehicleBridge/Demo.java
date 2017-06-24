package VehicleBridge;

import VehicleBridge.concept.BoatConcept;
import VehicleBridge.concept.CarConcept;
import VehicleBridge.concept.VehicleConcept;
import VehicleBridge.implementation.ElectricMotorImp;
import VehicleBridge.implementation.FuelMotorImp;

public class Demo {

	/*
	 * This is a demo for the Bridge Pattern.
	 * Through this application it is assumed 
	 * that any vehicle is fully defined
	 * when the behavior of its motor is defined.
	 * 
	 * Thus, VehicleConcept is the concept (or abstraction)
	 * which may be further extend without compromising at all
	 * its implementation, MotorVehicle implementation (and sub-types).
	 * 
	 */
	public static void main(String[] args) {
	
		/* Neither concept defines what a car behaves like exactly. 
		 * It only mentions what behavior in general is expected from a car.
		 * However, children of vehicle concept hold a reference to 
		 * a Vehicle implementation that clearly defines this behavior.
		 * This means 'car' for instance, only knows its exact behavior 
		 * during runtime. In compile-time, only references to the 
		 * implementations (or pointers for C++) exist. 
		 */		
		VehicleConcept electricCar = new CarConcept(new ElectricMotorImp());
		VehicleConcept electricBoat = new BoatConcept(new ElectricMotorImp());
		VehicleConcept fuelCar = new CarConcept(new FuelMotorImp());
				
		// Something this is what happens inside a VehicleConcept
//		MotorVehicleImp reference = new ElectricMotorImp();
		
		System.out.println(electricCar);
		electricCar.start();
		electricCar.increaseSpeed();
				
		System.out.println(electricBoat);
		electricBoat.start();	
		electricBoat.increaseSpeed();
		
		System.out.println(fuelCar);
		fuelCar.start();	
		fuelCar.increaseSpeed();

	}
	
}
