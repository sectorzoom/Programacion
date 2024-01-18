package POO1;

public class Hero {
    private int lvl;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;
    private static final int maxRest = 50;
    private static final int maxHealthPot = 10;
    

    public Hero(String name, int lvl, int health, int maxHealth, int experience, int attack, int defense) {
        this.lvl = lvl;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }
    public int drinkPotion(){
        if (maxHealth-health < maxHealthPot){
            health = (maxHealth-health) + health;
        } else {
            health = health + maxHealthPot;
        }
        return health;
    }
    public int rest(){
        if (maxHealth-health < maxRest){
            health = (maxHealth-health) + health;
        } else {
            health = health + maxRest;
        }
        return health;
    }
    public int attack(Hero otherHero){
        return otherHero.health - Math.max (this.attack - otherHero.defense,10);
    }
    public void lvlUp(){
        experience = experience+10;
        if (experience == 50){
            lvl = lvl + 1;
            maxHealth = maxHealth+5;
            health = health+5;
            attack = attack+1;
            defense = defense+1;
        }
    }
}
