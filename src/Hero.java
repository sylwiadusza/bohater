public class Hero {
        String name;
        String abilities;
        int lvl;
        double damage;
        boolean fame;
        //elementy, które użytkownik musi wpisać tworzać nowego bohatera
        Hero(String name, String abilities, int lvl, double damage, boolean fame) {
            this.name = name;   //podpisywnie
            this.abilities = abilities;
            this.lvl = lvl;
            this.damage = damage;
            this.fame = fame;
        }

}
