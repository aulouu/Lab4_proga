import Persons.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Piglet piglet = new Piglet("Пятачок");
        WinnieThePooh winnieThePooh = new WinnieThePooh("Винни-Пух");
        ChristopherRobin christopherRobin = new ChristopherRobin("Кристофер Робин");
        Rabbit rabbit = new Rabbit("Кролик");
        All all = new All("все");
        Area area = new Area();
        Ground ground = new Ground("земле");
        Ground.Chamomile chamomile = new Ground.Chamomile("ромашке");
        Ground.Chamomile.Petal petal = chamomile.new Petal("лепестки");
        Song song = new Song("песню");
        Ground.Boot boot = new Ground.Boot("сапог");

        winnieThePooh.sit();
        winnieThePooh.rest(christopherRobin.getName());
        christopherRobin.rest(winnieThePooh.getName());
        christopherRobin.pull(boot.getName());
        boot.wear();
        christopherRobin.dontunderstand();
        christopherRobin.went();
        christopherRobin.meet(rabbit.getName());
        christopherRobin.bye(rabbit.getName());
        christopherRobin.run(piglet.getName());

        if ((piglet.getLoc() == null) || (christopherRobin.getLoc() == null) || (rabbit.getLoc() == null) || (all.getLoc() == null)){
            throw new Location("Локация не задана");
        }

        if (piglet.getLoc() == LocationForPerson.GROUND){
            piglet.sit(ground.getName());
            piglet.wonder(chamomile.getName());
            petal.tear(petal.getName());
            piglet.know();
            piglet.remember();
            winnieThePooh.appear();
        }

        if ((christopherRobin.getLoc() == LocationForPerson.AREA) || (rabbit.getLoc() == LocationForPerson.AREA) || (all.getLoc() == LocationForPerson.AREA)){
            area.expedition();
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
            area.cry();
            all.come();
            all.chat();
            winnieThePooh.compose(song.getName());
            winnieThePooh.sing();
            System.out.print(song.toString());
        }
    }
}

class Area{
    public void expedition(){
        class Expedition{
            void start(){
                System.out.println("Спустя немного времени все были в сборе, и экспедиция началась.");
            }
        }
        Expedition expedition = new Expedition();
        expedition.start();
    }
    public void cry(){
        class Cry{
            void overheard(){
                System.out.print("Тут в голове колонны послышался крик.");
            }
        }
        Cry cry = new Cry();
        cry.overheard();
    }
}
