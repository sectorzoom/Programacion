package POO3.Ej8;

public class Fireball extends Attack{


    public Fireball(int manaCost, int physicalEffort, int magicDamage, int physicalDamage) {
        super(manaCost, physicalEffort, magicDamage, physicalDamage);
    }

    @Override
    public void throwAttack() {
        System.out.println("¡Bola de fuego lanzada!");
    }

    @Override
    public int[] damageInflicted() {
        return new int[]{super.magicDamage, 0};
    }
}
