package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.vehicle.FactoryVehicleBMW;
import designpatterns.creational.abstractfactory.vehicle.FactoryVehicleTata;
import designpatterns.creational.abstractfactory.vehicle.IFactoryVehicleFactory;

public class AbstractFactory {

	public IFactoryVehicleFactory getFactory(String manufacterName) {
		if ("tata".equals(manufacterName)) {
			return new FactoryVehicleTata();
		} else {
			return new FactoryVehicleBMW();
		}
	}
}
