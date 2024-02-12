package POO3.Ej8;

public class Main {
    public static void main(String[] args) {
        IAdvancedAttack fireball = new Fireball(10, 0, 20);
        IAdvancedAttack swordBlow = new SwordBlow(0, 10, 30);
        IAdvancedAttack enchantedSword = new EnchantedSword(15, 15, 25, 15);

        executeAttack(fireball);
        executeAttack(swordBlow);
        executeAttack(enchantedSword);
    }

    public static void executeAttack(IAdvancedAttack attack) {
        attack.throwAttack();
        System.out.println("Costo del ataque: " + attack.costOfAttack());
        int[] damage = attack.damageInflicted();
        System.out.println("Daño mágico: " + damage[0]);
        System.out.println("Daño físico: " + damage[1]);
        System.out.println("Daño total: " + (damage[0] + damage[1]));
    }
}

