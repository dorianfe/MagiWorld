public abstract class Hero {
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int level;
    protected int health;
    protected int damage;
    protected int playerNumber;


    public Hero(int strength, int intelligence, int agility, int level, int playerNumber) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.level = level;
        this.agility = agility;
        this.health = level * 5;
        this.playerNumber = playerNumber;
    }


    public int removeHealth(int damage) {
        this.health -= damage;
        if (health < 0) {
            health = 0;
        }
        return health;
    }

    public int getHealth() {
        return health;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void attack(Hero targetHero){
        targetHero.removeHealth(damage);
    }

    public abstract void specialAttack(Hero targetHero);


}
