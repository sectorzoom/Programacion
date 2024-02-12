package POO3.Ej8;

public class EnchantedSword extends SwordBlow {
    private final int magicDamage;

    public EnchantedSword(int manaCost, int physicalEffort, int physicalDamage, int magicDamage) {
        super(manaCost, physicalEffort, physicalDamage);
        this.magicDamage = magicDamage;
    }

    @Override
    public void throwAttack() {
        System.out.println("¡Espadazo encantado ejecutado!");
    }

    @Override
    public int[] damageInflicted() {
        return new int[]{magicDamage, super.damageInflicted()[1]}; // Devuelve daño mágico y físico
    }
}
