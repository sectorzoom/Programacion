package POO4.Ej5;

import java.util.Random;

public class Mage implements ICombatiente {
    private int life;
    private int baseDamage;
    private int meleeDefense;
    private int rangedDefense;
    private int fighterNumber;
    private String typeOfFighter;
    static Random random = new Random();

    public Mage(int life, int baseDamage, int meleeDefense, int rangedDefense, int fighterNumber, String typeOfFighter) {
        this.life = life;
        this.baseDamage = baseDamage;
        this.meleeDefense = meleeDefense;
        this.rangedDefense = rangedDefense;
        this.fighterNumber = fighterNumber;
        this.typeOfFighter = typeOfFighter;
    }

    @Override
    public Attack attack() {
        int failureProbability = random.nextInt(100);
        if (failureProbability <= 10) {
            System.out.println("¡El ataque del combatiente " + typeOfFighter + " número " + fighterNumber + " ha fallado!");
            return null;
        } else {
            int damage = baseDamage + random.nextInt(0,(100+life)/2); //Más daño cuanto más vida tiene
            System.out.println("¡El ataque del combatiente " + typeOfFighter + " número " + fighterNumber + " ha sido un éxito!");
            int typeOfAttackProbability = random.nextInt(100);
            if (typeOfAttackProbability <= 10){
                return new Attack(damage/2, Attack.TypeOfDamage.PHYSICAL, Attack.TypeOfAttack.MELEE);
            } else {
                return new Attack(damage, Attack.TypeOfDamage.MAGIC, Attack.TypeOfAttack.RANGED);
            }
        }
    }

    @Override
    public void defend(Attack attack) {
        int randomDefense = random.nextInt(11)-5;
        if(randomDefense < 0) {
            randomDefense = 0;
        }
        int currentDefense;
        if (attack.getTypeOfAttack() == Attack.TypeOfAttack.MELEE) {
            currentDefense = meleeDefense + randomDefense;
        } else  {
            currentDefense = rangedDefense + randomDefense;
        }
        int damageReceived = attack.getDamageQuantity() - currentDefense;
        if (damageReceived < 0){
            damageReceived = 0;
        }
        life -= damageReceived;
    }

    @Override
    public boolean isHeLive() {
        return life > 0;
    }
}
