package POO3.Ej8;

public class Main {
    public static void main(String[] args) {
        Attack fireball = new Fireball(10, 0, 20,0);
        Attack swordBlow = new SwordBlow(0, 10, 0,30);
        Attack enchantedSword = new EnchantedSword(15, 15, 25, 15);

        executeAttack(fireball);
        executeAttack(swordBlow);
        executeAttack(enchantedSword);
    }

    public static void executeAttack(Attack attack) {
        attack.throwAttack();
        int cost = CostOfAttack.calculateCost(attack);
        System.out.println("Costo del ataque: " + cost);
        System.out.println("Costo del ataque de otra manera: " + attack.costOfAttack().calculateCost2(attack.manaCost,attack.physicalEffort));
        int[] damage = attack.damageInflicted();
        System.out.println("Daño mágico: " + damage[0]);
        System.out.println("Daño físico: " + damage[1]);
        System.out.println("Daño total: " + (damage[0] + damage[1]));
    }
}

