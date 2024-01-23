package POO1;
import java.util.Random;

public class RolGame {
    static Random random = new Random();
    private static final int maxEnemies = 3;
    private static final double rngHeal = 0.1;
    private static final double rngScape = 0.1;
    public static void main(String[] args) {
        game();
    }
    private static void game(){
        Hero mainHero = mainHero();
        int horda = 0;
        while (mainHero.getHealth() > 0) {
            horda++;
            Hero[] enemies = enemies();
            battle(mainHero,enemies);
            rest(mainHero);
            System.out.println("Fin de la horda " + horda + ": " + mainHero);
        }
        System.out.println("El héroe ha sido derrotado después de " + (horda - 1) + " hordas.");
    }
    private static Hero mainHero(){
        return new Hero("Main Hero", 1, 100, 100, 0, 20, 10);
    }
    private static Hero[] enemies(){
        int numEnemies = random.nextInt(maxEnemies) + 1;
        Hero[] enemies = new Hero[numEnemies];
        for (int i = 0; i < numEnemies; i++) {
            enemies[i] = new Hero("Enemy " + (i + 1), 1, 50, 50, 0, 10, 5);
        }
        return enemies;
    }
    private static void battle(Hero mainHero, Hero[] enemies){
        while (mainHero.getHealth() > 0 && thereAreEnemiesLives(enemies)) {
            for (Hero enemy : enemies) {
                if (random.nextDouble() < rngScape) {
                    System.out.println(enemy.getName() + " ha huido de la pelea!");
                } else {
                    mainHero.attack(enemy);
                }
            }
            for (Hero enemy : enemies) {
                if (enemy.getHealth() > 0) {
                    enemy.attack(mainHero);
                }
            }
        }
    }
    private static void rest(Hero mainHero){
        if (random.nextDouble() < rngHeal) {
            mainHero.rest();
            System.out.println("¡El héroe ha descansado y recuperado vida!");
        } else if (random.nextDouble() < rngHeal) {
            mainHero.drinkPotion();
            System.out.println("¡El héroe ha encontrado una poción y recuperado vida!");
        }
    }
    private static boolean thereAreEnemiesLives(Hero[] enemies) {
        for (Hero enemy : enemies) {
            if (enemy.getHealth() > 0) {
                return true;
            }
        }
        return false;
    }
}
