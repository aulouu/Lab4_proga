package Persons;

import Moves.*;

public class Rabbit extends Person implements Location{
    public Rabbit(String name){
        super(name);
    }
    LocationForPerson loc = LocationForPerson.AREA;
    @Override
    public void getLocation(){
        super.getLocation();
    }
    @Override
    public void setLocation(boolean location){
        super.setLocation(location);
    }
    @Override
    public String toString(){
        return "Кролик";
    }
    @Override
    public void changeLoc(LocationForPerson e){
        loc = e;
    }
    @Override
    public LocationForPerson getLoc(){
        return loc;
    }
    public void go(){
        System.out.print(" и " + getName() + ", ");
    }
}
