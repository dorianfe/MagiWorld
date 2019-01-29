public class Warrior extends Hero {

    public Warrior(int strength, int intelligence, int agility, int level, int playerNumber) {
        super(strength, intelligence, agility, level, playerNumber);
        this.damage = strength;

    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void specialAttack(Hero targetHero) {

        targetHero.removeHealth(damage*2);
        removeHealth(damage/2);

    }
}
