public class Rogue extends Hero {


    public Rogue(int strength, int intelligence, int agility, int level, int playerNumber) {
        super(strength, intelligence, agility, level, playerNumber);
        this.damage = agility;

    }

    @Override
    public void specialAttack(Hero targetHero) {

    }

    public int getDmg() {
        return damage;
    }
}


