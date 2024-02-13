package POO3.Ej8;

public abstract class Attack implements IAdvancedAttack {
    protected int manaCost;

    protected int physicalEffort;

    protected int magicDamage;

    protected int physicalDamage;

    public Attack(int manaCost, int physicalEffort, int magicDamage, int physicalDamage) {
        this.manaCost = manaCost;
        this.physicalEffort = physicalEffort;
        this.magicDamage = magicDamage;
        this.physicalDamage = physicalDamage;
    }

    public int getPhysicalEffort() {
        return physicalEffort;
    }

    @Override
    public int getManaCost() {
        return manaCost;
    }

    @Override
    public abstract void throwAttack();

    @Override
    public abstract int[] damageInflicted();
    public abstract CostOfAttack costOfAttack();
}