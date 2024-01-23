package POO1;

import java.util.Scanner;

public class MainHero {
    private static final int defaultExperience = 0;
    private static final int defaultLvl = 1;

    public static void main(String[] args) {
        Hero hero1 = createHero();
        Hero hero2 = createHero();
        int round = 0;
        while (hero1.getHealth() > 0 && hero2.getHealth() > 0) {
            hero2.attack(hero1);
            hero1.attack(hero2);
            round++;
            System.out.println("Después de " + round + " asaltos: ");
            System.out.println(hero1.getName()+ ": " + hero1);
            System.out.println(hero2.getName() + ": " + hero2);
        }
        if (hero1.getHealth() <= 0) {
            System.out.println(hero2.getName() + " ha ganado. " + hero1.getName() + " ha sido derrotado.");
        } else {
            System.out.println(hero1.getName() + " ha ganado. " + hero2.getName() + " ha sido derrotado.");
        }
        System.out.println(hero2.getName() + " se toma una poción para preparar su próximo asalto. " + hero1.getName() + " opta por echarse una siesta.");
        hero2.drinkPotion();
        hero1.rest();
        System.out.println("Vida de " + hero2.getName() + ": " + hero2.getHealth());
        System.out.println("Vida de " + hero1.getName() + ": " + hero1.getHealth());
    }

    private static Hero createHero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del Héroe: ");
        String name = scanner.nextLine();
        System.out.println("Ingresa la cantidad de vida del Héroe: ");
        int maxHealth = scanner.nextInt();
        System.out.println("Ingresa el ataque de tu Héroe: ");
        int attack = scanner.nextInt();
        System.out.println("Ingresa la defensa de tu Héroe: ");
        int defense = scanner.nextInt();
        return new Hero(name, defaultLvl, maxHealth, maxHealth, defaultExperience, attack, defense);
    }
}
