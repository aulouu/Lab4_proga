import Moves.ForBoot;

public class Boot implements ForBoot {
    private String name;

    public Boot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Сапог";
    }
    @Override
    public void wear(){
        System.out.println("пока он наконец не наделся.");
    }
}
