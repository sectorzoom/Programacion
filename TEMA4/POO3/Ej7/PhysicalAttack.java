package POO3.Ej7;

public class PhysicalAttack implements IAttack{

    private final int cost;
    private final int damage;

    public PhysicalAttack(int cost, int damage){
        this.cost = cost;
        this.damage = damage;
    }
    @Override
    public void throwAttack() {
        System.out.println("Has lanzado un ataque físico.");
    }

    @Override
    public int getCostAttack() {
        return cost;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
