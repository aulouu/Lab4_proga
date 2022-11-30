package Persons;

public class WinnieThePooh extends Person {
    public WinnieThePooh(String name){
        super(name);
    }
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
        return "Винни-Пух";
    }
    public void appear(){
        System.out.println("И тут появился " + getName() + ". ");
    }
    public void go(){
        System.out.print(" и " + getName() + ", ");
    }
    public void compose(String name){
        System.out.println("Все, кроме " + getName() + ", который сочинял ");
    }
    public void sing(){
        System.out.print("На это " + getName() + " не нашел, что ответить, и поэтому начал петь: ");
    }
}
