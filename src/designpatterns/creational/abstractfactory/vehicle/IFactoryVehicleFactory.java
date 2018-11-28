package designpatterns.creational.abstractfactory.vehicle;

import designpatterns.creational.factory.vehicle.Vehicle;

public interface IFactoryVehicleFactory {
	public Vehicle getVehicle(int carryCapacity);
}
