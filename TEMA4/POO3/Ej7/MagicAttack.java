package POO3.Ej7;

public class MagicAttack implements IAttack {
    private final int cost;
    private final int damage;

    public MagicAttack(int cost, int damage){
        this.cost = cost;
        this.damage = damage;
    }

    @Override
    public void throwAttack() {
        System.out.println("Has lanzado un ataque mágico");
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
