package desingpatterns.creational.builder;


import desingpatterns.creational.builder.builder.House;
import desingpatterns.creational.builder.builder.OneBedroomHouseBuilder;
import desingpatterns.creational.builder.director.Architect;

public class Client {
	
	public static void main(String args[]) throws Exception{
		System.out.println("Builder Design pattern example ");
        Architect architect = new Architect();

        // Hiding complexity and building one bed room house
        architect.setHouseBuilder(new OneBedroomHouseBuilder());
        architect.buildHouse();
        House house = architect.getFinishedHouse();
        System.out.println(house);

	}
}
