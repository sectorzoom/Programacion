package POO4.Ej5;

public class Attack{
    public enum TypeOfDamage{
        PHYSICAL, MAGIC
    }
    public enum TypeOfAttack{
        MELEE, RANGED
    }
    private int damageQuantity;
    private TypeOfDamage typeOfDamage;
    private TypeOfAttack typeOfAttack;

    public Attack(int damageQuantity, TypeOfDamage typeOfDamage, TypeOfAttack typeOfAttack) {
        this.damageQuantity = damageQuantity;
        this.typeOfDamage = typeOfDamage;
        this.typeOfAttack = typeOfAttack;
    }

    public int getDamageQuantity() {
        return damageQuantity;
    }

    public TypeOfDamage getTypeOfDamage() {
        return typeOfDamage;
    }

    public TypeOfAttack getTypeOfAttack() {
        return typeOfAttack;
    }
}