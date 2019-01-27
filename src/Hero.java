public abstract class Hero {
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int level;
    protected int health;


    public Hero(int strength, int intelligence, int agility, int level, int health) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.level = level;
        this.agility = agility;
        this.health = level * 5;
    }


    public void removeHealth(int damage) {
        this.health -= damage;
        if (health < 0) {
            health = 0;
        }


    }

    public void attack(Hero targetHero) {

        
    }
}
