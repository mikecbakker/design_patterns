package designpatterns.creational.abstractfactory.vehicle;

import designpatterns.creational.factory.vehicle.Pickup;
import designpatterns.creational.factory.vehicle.Van;
import designpatterns.creational.factory.vehicle.Vehicle;

public class FactoryVehicleBMW implements IFactoryVehicleFactory {
	
	public Vehicle getVehicle(int carryCapacity) {
		
		if (carryCapacity < 2) {
			return new Van();
		}
		return new Pickup();
	}

}
