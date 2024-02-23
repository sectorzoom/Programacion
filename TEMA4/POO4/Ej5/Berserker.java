package POO4.Ej5;
import java.util.Random;

public class Berserker implements ICombatiente {
    private int life;
    private final int baseDamage;
    private final int meleeDefense;
    private final int rangedDefense;
    private final int fighterNumber;
    private final String typeOfFighter;
    static Random random = new Random();

    public Berserker(int life, int baseDamage, int meleeDefense, int rangedDefense, int fighterNumber, String typeOfFighter) {
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
        if (failureProbability <= 20) {
            System.out.println("¡El ataque del combatiente " + typeOfFighter + " número " + fighterNumber + " ha fallado!");
            return null;
        } else {
            int randomDamage = random.nextInt(100);
            int damage = baseDamage + Math.abs((randomDamage-life)/2); //Más daño cuanto menos vida tiene
            System.out.println("¡El ataque del combatiente " + typeOfFighter + " número " + fighterNumber + " ha sido un éxito!");
            return new Attack(damage, Attack.TypeOfDamage.PHYSICAL, Attack.TypeOfAttack.MELEE);
        }
    }

    @Override
    public void defend(Attack attack) {
        int randomDefense = random.nextInt(11)-5;
        if (randomDefense < 0) {
            randomDefense = 0;
        }
        int currentDefense;
        if (attack.getTypeOfAttack() == Attack.TypeOfAttack.RANGED){
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