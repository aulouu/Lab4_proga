public class Ground {
    private String name;
    public Ground (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Земля";
    }
    public static class Chamomile extends Ground{
        private String name;
        public Chamomile (String name){
            super(name);
        }
        public String getName(){
            return name;
        }
        @Override
        public String toString(){
            return "Ромашка";
        }

        public class Petal {
            private String name;
            public Petal (String name){
                this.name = name;
            }
            public String getName(){
                return name;
            }
            @Override
            public String toString(){
                return "Лепестки";
            }
            public void tear(String name){
                System.out.print(" отрывая " + name);
            }
        }
    }
    public static class Boot extends Ground {
        private String name;

        public Boot(String name) {
            super(name);
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Сапог";
        }
        public void wear(){
            System.out.println("пока он наконец не наделся.");
        }
    }
}
