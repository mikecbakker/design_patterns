package desingpatterns.creational.builder.builder;

import desingpatterns.creational.builder.room.BathRoom;
import desingpatterns.creational.builder.room.BedRoom;
import desingpatterns.creational.builder.room.LivingRoom;

public class OneBedroomHouseBuilder extends HouseBuilder {

	@Override
	public void addRooms() {
		getHouse().rooms.add(new BathRoom());
		getHouse().rooms.add(new BedRoom());
		getHouse().rooms.add(new LivingRoom());
	}
}
