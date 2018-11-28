package designpatterns.creational.abstractfactory;

public class Client {

	public static void main(String args[]) {
	
		AbstractFactory abstractFactory = new AbstractFactory();
		System.out.println(abstractFactory.getFactory("tata").getVehicle(3).getType());
		System.out.println(abstractFactory.getFactory("tata").getVehicle(6).getType());
		System.out.println(abstractFactory.getFactory("bmw").getVehicle(3).getType());
		System.out.println(abstractFactory.getFactory("bmw").getVehicle(6).getType());
	}
}
