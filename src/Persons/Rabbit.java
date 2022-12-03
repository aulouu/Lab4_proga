package Persons;


public class Rabbit extends Person implements ChangeLocation {
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
    public void go(){
        System.out.print(" и " + getName() + ", ");
    }
    @Override
    public void changeLoc(LocationForPerson e){
        loc = e;
    }
    @Override
    public LocationForPerson getLoc(){
        return loc;
    }
}
