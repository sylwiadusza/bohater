public class Hero {
    private String name;
    private String abilities;
    private int lvl;
    private double damage;
    private boolean fame;

    //elementy, które użytkownik musi wpisać tworzać nowego bohatera

    public Hero(String name, String abilities, int lvl, double damage, boolean fame) {
        this.name = name;
        this.abilities = abilities;
        this.lvl = lvl;
        this.damage = damage;
        this.fame = fame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public boolean getFame() {
        return fame;
    }

    public void setFame(boolean fame) {
        this.fame = fame;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", abilities='" + abilities + '\'' +
                ", lvl=" + lvl +
                ", damage=" + damage +
                ", fame=" + fame +
                '}';
    }

    public double damagePerSecond () {
        return damage*5;
    }
}
