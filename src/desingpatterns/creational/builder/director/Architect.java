package desingpatterns.creational.builder.director;

import desingpatterns.creational.builder.builder.House;
import desingpatterns.creational.builder.builder.HouseBuilder;

public class Architect {

	private HouseBuilder houseBuilder;

	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void buildHouse() {
		houseBuilder.addRooms();
		houseBuilder.addPlumbingSystem();
		houseBuilder.addAirConditionerSystem();
		houseBuilder.addSecuritySystem();
		houseBuilder.paintHouse("white");
	}

	public House getFinishedHouse() {
		return houseBuilder.getHouse();
	}
}
