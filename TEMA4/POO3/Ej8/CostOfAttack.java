package POO3.Ej8;

public class CostOfAttack {
    int manaCost;
    int physicalEffort;
    public CostOfAttack(int manaCost, int physicalEffort) {
        this.manaCost = manaCost;
        this.physicalEffort = physicalEffort;

    }

    public static int calculateCost(IAdvancedAttack attack) {
        int physicalEffort = attack.getPhysicalEffort();
        int manaCost = attack.getManaCost();
        return physicalEffort + manaCost;
    }
    public static int calculateCost2(int manaCost, int physicalEffort){
        return physicalEffort + manaCost;
    }
}
