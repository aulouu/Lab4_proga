package Persons;

import Moves.Location;
import Moves.LocationForPerson;

public class All extends Person implements Location {
    public All(String name) {
        super(name);
    }
    LocationForPerson loc = LocationForPerson.AREA;
    @Override
    public void getLocation() {
        super.getLocation();
    }
    @Override
    public void setLocation(boolean location) {
        super.setLocation(location);
    }
    @Override
    public String toString() {
        return "Все";
    }
    @Override
    public void changeLoc(LocationForPerson e){
        loc = e;
    }
    @Override
    public LocationForPerson getLoc(){
        return loc;
    }
    public void come(){
        System.out.println(" Так " + getName() + " выступили в поход к Полюсу.");
    }
    public void chat(){
        System.out.println("По дороге " + getName() + " болтали о разных разностях.");
    }
}