import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
       Hero hero1 = new Hero("Janek", "mag",2, 22.5,true);
        System.out.println(hero1);
        System.out.println("Podaj imię");
        String s = scanner.next();
        hero1.setName(s);
        System.out.println(hero1.getName());
        System.out.println(hero1.getAbilities());
        System.out.println(hero1.getLvl());
        System.out.println(hero1.getDamage());
        System.out.println(hero1.getFame());
        System.out.println(hero1.getName());
        hero1.setAbilities("paladyn");
        System.out.println(hero1.getAbilities());
        hero1.setDamage(30.1);
        System.out.println(hero1.getDamage());
        hero1.setFame(false);
        System.out.println(hero1.getFame());
        System.out.println(hero1);
        System.out.println(hero1.damagePerSecond());
    }

}