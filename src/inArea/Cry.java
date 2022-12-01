package inArea;

import Moves.ForCry;

public class Cry implements ForCry{
    private String name;

    public Cry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Крик";
    }
    @Override
    public void overheard(){
        System.out.print("Тут в голове колонны послышался " + getName() + ".");
    }
}
