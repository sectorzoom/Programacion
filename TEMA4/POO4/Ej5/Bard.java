package POO4.Ej5;

import java.util.Random;

public class Bard implements ICombatiente{
    private int life;
    private final int basePhysicalDamage;
    private final int baseMagicDamage;
    private final int meleeDefense;
    private final int rangedDefense;
    private final int fighterNumber;
    private final String typeOfFighter;
    static Random random = new Random();

    public Bard(int life, int basePhysicalDamage, int baseMagicDamage, int meleeDefense, int rangedDefense, int fighterNumber, String typeOfFighter) {
        this.life = life;
        this.basePhysicalDamage = basePhysicalDamage;
        this.baseMagicDamage = baseMagicDamage;
        this.meleeDefense = meleeDefense;
        this.rangedDefense = rangedDefense;
        this.fighterNumber = fighterNumber;
        this.typeOfFighter = typeOfFighter;
    }

    @Override
    public Attack attack() {
        if (random.nextInt(100)<50) {
            int damage = basePhysicalDamage + random.nextInt(11)-5;
            if (damage < 0) {
                damage = 0;
            }
            System.out.println("¡El ataque del combatiente " + typeOfFighter + " número " + fighterNumber + " ha sido físico!");
            return new Attack(damage, Attack.TypeOfDamage.PHYSICAL,Attack.TypeOfAttack.MELEE);
        } else {
            int damage = baseMagicDamage + random.nextInt(11)-5;
            if (damage < 0) {
                damage = 0;
            }
            System.out.println("¡El ataque del combatiente " + typeOfFighter + " número " + fighterNumber + " ha sido mágico!");
            return new Attack (damage, Attack.TypeOfDamage.MAGIC, Attack.TypeOfAttack.RANGED);
        }
    }

    @Override
    public void defend(Attack attack) {
        int randomDefense = random.nextInt(11)-5;
        if (randomDefense < 0) {
            randomDefense = 0;
        }
        int currentDefense;
        if (attack.getTypeOfAttack() == Attack.TypeOfAttack.RANGED) {
            currentDefense = rangedDefense + randomDefense;
        } else {
            currentDefense = meleeDefense + randomDefense;
        }
        int damageReceived = attack.getDamageQuantity() - currentDefense;
        if (damageReceived < 0) {
            damageReceived = 0;
        }
        life -= damageReceived;
    }

    @Override
    public boolean isHeLive() {
        return life > 0;
    }
}
