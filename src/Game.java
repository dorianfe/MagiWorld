import java.util.Scanner;

public class Game {

    private Hero player1;
    private Hero player2;
    private Scanner sc = new Scanner(System.in);


    /**
     * Starts game
     */
    public Game() {
        player1 = createPlayer(1);

        player2 = createPlayer(2);

        Start();

    }

    // ---- Personnage création ----

    /**
     * Asks Hero's paramaters. Scanner is used.
     */
    private Hero createPlayer(int playerNumber) {
        int heroType, strength, agility, intelligence, level;
        System.out.println("Création du personnage du Joueur " + playerNumber);
        do {
            System.out.println("Veuillez choisir la classe du personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage");
            heroType = sc.nextInt();
            if (heroType == 0 || heroType > 3)
                System.out.println("Cette classe n'existe pas !");
        } while (heroType == 0 || heroType > 3);

        do {
            System.out.println("Niveau du personnage ?");
            level = sc.nextInt();
            System.out.println("Force du personnage ?");
            strength = sc.nextInt();
            System.out.println("Agilité du personnage ?");
            agility = sc.nextInt();
            System.out.println("Intelligence du personnage ?");
            intelligence = sc.nextInt();
            if ((strength + agility + intelligence) != level)
                System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");
        } while ((strength + agility + intelligence) != level);
        return initHero(heroType, strength, intelligence, agility, level, playerNumber);
    }

    /**
     * Instanciates Hero with the correct values.
     */
    private Hero initHero(int heroType, int strength, int intelligence, int agility, int level, int playerNumber) {
        Hero hero = null;
        switch (heroType) {
            case 1:
                hero = new Warrior(strength, intelligence, agility, level, playerNumber);
                System.out.println("Woarg");
                break;
            case 2:
                hero = new Rogue(strength, intelligence, agility, level, playerNumber);
                break;
            case 3:
                hero = new Mage(strength, intelligence, agility, level, playerNumber);
                break;
        }
        return hero;
    }

    // ---- Game turn ----

    /**
     * Turn system. Modulo differenciate turn 1 from turn 2.
     */
    private void Start() {
        int turn = 1;

        while (player1.getHealth() > 0 && player2.getHealth() > 0) {

            if (turn % 2 == 1) {
                Turn(player1, player2);
            } else {
                Turn(player2, player1);
            }
            turn++;
        }
        if (player1.getHealth() <= 0) {
            System.out.println("Joueur 1 à perdu !");
        } else {
            System.out.println("Joueur 2 à perdu !");
        }
    }

    /**
     * Method used each turn to select which attack will be used
     *
     * @param attack the attacking hero
     * @param defend the defending hero
     */
    private void Turn(Hero attack, Hero defend) {
        System.out.println("Joueur " + attack.getPlayerNumber() + " (" + attack.getHealth() + " de vitalité) veuillez choisir " +
                "votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
        int choix = sc.nextInt();
        if (choix == 1)
            attack.attack(defend);
        else
            attack.specialAttack(defend);
    }
}





