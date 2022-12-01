package inArea;

import Moves.ForExpedition;

public class Expedition implements ForExpedition {
    private String name;
    public Expedition (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Экспедиция";
    }
    @Override
    public void start(){
        System.out.println(getName() + " началась.");
    }
}
