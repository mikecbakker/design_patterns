package designpatterns.creational.factory;

import designpatterns.creational.factory.vehicle.Vehicle;

public class Client {

	public static void main(String args[]) {
	
		FactoryVehicle vehicleFactory = new FactoryVehicle();
		Vehicle a = vehicleFactory.getVehicle(4);
		System.out.println(a.getType());
		Vehicle b = vehicleFactory.getVehicle(6);
		System.out.println(b.getType());
	}
}
