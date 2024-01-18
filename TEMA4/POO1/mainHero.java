package POO1;

import java.util.Scanner;

public class mainHero {
    private static final int defaultExperience = 0;
    private static final int defaultLvl = 1;
    public static void main(String[] args) {
        Hero hero1 = hero();
    }
    private static Hero hero(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del Héroe: ");
        String name = scanner.nextLine();
        System.out.println("Ingresa la cantidad de vida del Héroe: ");
        int maxHealth = scanner.nextInt();
        System.out.println("Ingresa el ataque de tu Héroe: ");
        int attack = scanner.nextInt();
        System.out.println("Ingresa la defensa de tu Héroe: ");
        int defense = scanner.nextInt();

        return new Hero(name, defaultLvl,maxHealth,maxHealth, defaultExperience,attack,defense);
    }
}
