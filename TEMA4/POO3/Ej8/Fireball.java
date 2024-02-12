package POO3.Ej8;

public class Fireball extends Attack{
    private final int magicDamage;

    public Fireball(int manaCost, int physicalEffort, int magicDamage) {
        super(manaCost, physicalEffort);
        this.magicDamage = magicDamage;
    }

    @Override
    public void throwAttack() {
        System.out.println("¡Bola de fuego lanzada!");
    }

    @Override
    public int[] damageInflicted() {
        return new int[]{magicDamage, 0};
    }
}
