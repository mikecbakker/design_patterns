package desingpatterns.creational.builder.builder;

import java.util.ArrayList;
import java.util.List;

import desingpatterns.creational.builder.room.Room;

public class House {
	  List<Room> rooms = new ArrayList<>();
	    private String exteriorColor = "while";

	    public String getExteriorColor () {
	        return exteriorColor;
	    }

	    public void setExteriorColor (String exteriorColor) {
	        this.exteriorColor = exteriorColor;
	    }

	    @Override
	    public String toString () {
	        System.out.println("house has total rooms " + rooms.size());
	        System.out.println("house has color " + getExteriorColor());
	        return "";
	    }
}
