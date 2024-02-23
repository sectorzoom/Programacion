package POO4.Ej5;

import java.util.ArrayList;
import java.util.Random;

public class BattleRoyale {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<ICombatiente> fighters = new ArrayList<>();
        int fighterNumber = 1;
        for (int i = 0; i < 50; i++) {
            ICombatiente fighter = generateRandomFighter(fighterNumber);
            fighters.add(fighter);
            fighterNumber++;
        }
        while (fighters.size() > 1) {
            int indexFighter1 = random.nextInt(fighters.size());
            int indexFighter2 = random.nextInt(fighters.size());
            while (indexFighter1 == indexFighter2) {
                indexFighter2 = random.nextInt(fighters.size());
            }
            ICombatiente fighter1 = fighters.get(indexFighter1);
            ICombatiente fighter2 = fighters.get(indexFighter2);
            fight (fighter1,fighter2);
            if (!fighter1.isHeLive()) {
                fighters.remove(fighter1);
            }
            if (!fighter2.isHeLive()) {
                fighters.remove(fighter2);
            }
        }
        ICombatiente winner = fighters.getFirst();
        System.out.println("¡El vencedor del Battle Royale es: " + winner.getClass().getSimpleName() + "!");
    }
    private static ICombatiente generateRandomFighter(int fighterNumber){
        int type = random.nextInt(3);
        return switch (type) {
            case 0 -> new Berserker(100, 30, 20, 10, fighterNumber, "MELEE");
            case 1 -> new Mage(80, 25, 10, 15, fighterNumber, "RANGED");
            default -> new Bard(120, 25, 20, 15, 10, fighterNumber, "MELEE");
        };
    }
    private static void fight (ICombatiente fighter1, ICombatiente fighter2){
        while (fighter1.isHeLive() && fighter2.isHeLive()) {
            Attack attack1 = fighter1.attack();
            Attack attack2 = fighter2.attack();
            if (attack1 != null){
                fighter2.defend(attack1);
            }
            if (attack2 != null){
                fighter1.defend(attack2);
            }
        }
    }

}
