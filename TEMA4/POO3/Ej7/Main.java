package POO3.Ej7;

public class Main {
    public static void main(String[] args) {
        MagicalAndPhysicalAttack magicalAndPhysicalAttack = new MagicalAndPhysicalAttack(15, 25, 20);
        System.out.println("Coste del ataque mágico y físico: " + magicalAndPhysicalAttack.getCostAttack());
        System.out.println("Daño infligido por el ataque mágico y físico: " + magicalAndPhysicalAttack.getDamage());
        System.out.println("Daño físico infligido por el ataque: " + magicalAndPhysicalAttack.getPhysicalDamage());
        System.out.println("Daño mágico infligido por el ataque: " + magicalAndPhysicalAttack.getMagicDamage());
        magicalAndPhysicalAttack.throwAttack();
    }
}
