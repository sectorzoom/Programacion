package POO4.Ej5;

public interface ICombatiente {
    Attack attack();
    void defend(Attack attack);
    boolean isHeLive();
}
