package POO3.Ej8;

public class SwordBlow extends Attack {
    private final int physicalDamage;

    public SwordBlow(int manaCost, int physicalEffort, int physicalDamage) {
        super(manaCost, physicalEffort);
        this.physicalDamage = physicalDamage;
    }

    @Override
    public void throwAttack() {
        System.out.println("¡Espadazo ejecutado!");
    }

    @Override
    public int[] damageInflicted() {
        return new int[]{0, physicalDamage};
    }
}