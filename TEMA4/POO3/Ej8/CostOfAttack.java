package POO3.Ej8;

public class CostOfAttack {
    public static int calculateCost(IAdvancedAttack attack) {
        int physicalEffort = attack.getPhysicalEffort();
        int manaCost = attack.getManaCost();
        return physicalEffort + manaCost;
    }
}
