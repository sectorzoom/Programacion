package POO3.Ej7;

public class MagicalAndPhysicalAttack implements IAttack {

    private final int cost;
    private final int magicDamage;
    private final int physicalDamage;

    public MagicalAndPhysicalAttack(int cost, int magicDamage, int physicalDamage){
        this.cost = cost;
        this.magicDamage = magicDamage;
        this. physicalDamage = physicalDamage;
    }
    @Override
    public void throwAttack() {
        System.out.println("Has lanzado un ataque combinado");
    }

    @Override
    public int getCostAttack() {
        return cost;
    }

    @Override
    public int getDamage() {
        return physicalDamage+magicDamage;
    }

    public int getPhysicalDamage() {
        return  physicalDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }
}
