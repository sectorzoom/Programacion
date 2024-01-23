package POO1;

public class Hero {
    private final String name;
    private int lvl;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;
    private static final int maxPotion = 10;
    private static final int maxRest = 50;
    private static final int minExp = 10;
    private static final int maxExp = 50;
    private static final int maxLvlUpHealth = 5;
    private static final int reset = 0;

    public Hero(String name, int lvl, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.lvl = lvl;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }
    public int getHealth() {
        return health;
    }
    public String getName(){
        return name;
    }
    public void drinkPotion(){
        health = Math.min(health + maxPotion, maxHealth);
    }
    public void rest(){
        health = Math.min(health + maxRest, maxHealth);
    }
    public void attack(Hero otherHero) {
        int damage = Math.max(this.attack - otherHero.defense, 10);
        otherHero.health = Math.max(0, otherHero.health - damage);
        experience += minExp;
        lvlUp();
    }

    public void lvlUp() {
        if (experience >= maxExp) {
            lvl++;
            maxHealth += maxLvlUpHealth;
            health += maxLvlUpHealth;
            attack++;
            defense++;
            experience = reset;
        }
    }
    public String toString() {
        return "Hero " +
                "lvl=" + lvl +
                ", health=" + health +
                ", maxHealth=" + maxHealth +
                ", experience=" + experience +
                ", attack=" + attack +
                ", defense=" + defense;
    }
}
