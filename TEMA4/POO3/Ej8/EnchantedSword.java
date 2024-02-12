package POO3.Ej8;

public class EnchantedSword extends SwordBlow {

    public EnchantedSword(int manaCost, int physicalEffort, int magicDamage, int physicalDamage) {
        super(manaCost, physicalEffort, magicDamage, physicalDamage);
    }

    @Override
    public void throwAttack() {
        System.out.println("¡Espadazo encantado ejecutado!");
    }

    @Override
    public int[] damageInflicted() {
        return new int[]{magicDamage, physicalDamage};
    }
}
