package POO3.Ej8;

public abstract class Attack implements IAdvancedAttack {
    protected int manaCost;
    protected int physicalEffort;

    public Attack(int manaCost, int physicalEffort) {
        this.manaCost = manaCost;
        this.physicalEffort = physicalEffort;
    }

    @Override
    public int costOfAttack() {
        return manaCost + physicalEffort;
    }

    @Override
    public abstract void throwAttack();

    @Override
    public abstract int[] damageInflicted();
}