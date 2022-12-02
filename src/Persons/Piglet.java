package Persons;

import Moves.*;

public class Piglet extends Person implements ForPiglet, Location {
    public Piglet(String name){
        super(name);
    }
    LocationForPerson loc = LocationForPerson.GROUND;
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
        return "Пятачок";
    }
    @Override
    public void changeLoc(LocationForPerson e){
        loc = e;
    }
    @Override
    public LocationForPerson getLoc(){
        return loc;
    }
    @Override
    public void sit(String name){
        System.out.print(getName() + " сидел на " + name);
    }
    @Override
    public void wonder(String name){
        System.out.print(" и гадал на " + name + ", ");
    }
    @Override
    public void know(){
        System.out.println(" и выясняя - " + Action.LOVE.getAction() + ", " + Action.DONTLOVE.getAction() + ", " + Action.SPIT.getAction() + ", " + Action.KISS.getAction() + ".");
    }
    @Override
    public void remember(){
        System.out.println("Оказалось, что плюнет, и он теперь старался вспомнить, на кого он загадл, надеясь, что это не Пух. ");
    }
    public void go(){
        System.out.print("за ним " + getName());
    }
}
