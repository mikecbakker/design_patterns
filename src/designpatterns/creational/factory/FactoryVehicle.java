package designpatterns.creational.factory;

import designpatterns.creational.factory.vehicle.Pickup;
import designpatterns.creational.factory.vehicle.Van;
import designpatterns.creational.factory.vehicle.Vehicle;

public class FactoryVehicle {
	
	public Vehicle getVehicle(int carryCapacity) {
		
		if (carryCapacity < 5) {
			return new Van();
		}
		return new Pickup();
	}

}
