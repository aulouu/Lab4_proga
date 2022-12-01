import Persons.*;
import inGround.*;
import inArea.*;

public class Main {
    public static void main(String[] args) {
        Piglet piglet = new Piglet("Пятачок");
        WinnieThePooh winnieThePooh = new WinnieThePooh("Винни-Пух");
        ChristopherRobin christopherRobin = new ChristopherRobin("Кристофер Робин");
        Rabbit rabbit = new Rabbit("Кролик");
        All all = new All("все");
        Expedition expedition = new Expedition("экспедиция");
        Ground ground = new Ground("земле");
        Chamomile chamomile = new Chamomile("ромашке");
        Cry cry = new Cry ("крик");
        Song song = new Song("песню");

        winnieThePooh.sit();
        winnieThePooh.rest();

        Location isGround = Location.GROUND;
        if (isGround == Location.GROUND){
            piglet.sit();
            ground.sit();
            piglet.wonder();
            chamomile.wonder();
            piglet.know();
            piglet.remember();
            winnieThePooh.appear();
        }


        Location isArea = Location.AREA;
        if (isArea == Location.AREA){
            System.out.print("Спустя немного времени все были в сборе, и ");
            expedition.start();
            christopherRobin.go();
            rabbit.go();
            piglet.go();
            winnieThePooh.go();
            MovesInArea kenga = new MovesInArea() {
                @Override
                public void go() {
                    System.out.print("далее Кенга ");
                }
            };
            kenga.go();
            MovesInArea littleRu = new MovesInArea() {
                @Override
                public void go() {
                    System.out.print("с Крошкой Ру  ");
                }
            };
            littleRu.go();
            MovesInArea owl = new MovesInArea() {
                @Override
                public void go() {
                    System.out.print("и Сова,  ");
                }
            };
            owl.go();
            MovesInArea ia = new MovesInArea() {
                @Override
                public void go() {
                    System.out.println("еще дальше - Иа,");
                }
            };
            ia.go();
            MovesInArea others = new MovesInArea() {
                @Override
                public void go() {
                    System.out.println("а в самом конце, растянувшись длинной цепочкой, шли все Родные и Знакомые Кролика.");
                }
            };
            others.go();
            cry.overheard();
            all.come();
            all.chat();
            winnieThePooh.compose(song.getName());
            winnieThePooh.sing();
            System.out.print(song.toString());
        }
    }
}