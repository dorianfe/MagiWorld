public class Mage extends Hero {

    public Mage(int strength, int intelligence, int agility, int level, int playerNumber) {
        super(strength, intelligence, agility, level, playerNumber);
        this.damage = intelligence;

    }

    @Override
    public void specialAttack(Hero targetHero) {

    }

    public int getDmg() {
        return damage;
    }
}


