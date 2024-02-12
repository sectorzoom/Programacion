package POO3.Ej8;

public class SwordBlow extends Attack {


    public SwordBlow(int manaCost, int physicalEffort, int magicDamage, int physicalDamage) {
        super(manaCost, physicalEffort, magicDamage, physicalDamage);
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