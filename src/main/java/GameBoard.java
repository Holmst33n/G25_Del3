import java.util.Scanner;

public class GameBoard {

    private int playerAmount;

    /**
     * @param players amount of players
     */
    public GameBoard(int players){
        this.playerAmount = players;
    }

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Indtast antallet af spillere (2-4): ");

        int spillere = this.playerAmount;
        GameBoard gameBoard = new GameBoard(spillere);

        Player player1 = new Player(1, "Hund");
        player1.setTurnIndicator(true);
        Player player2 = new Player(2, "Kat");
        Player player3 = new Player(3, "Bil");
        Player player4 = new Player(4, "Båd");

        while(player1.getBalance() > 0 && player2.getBalance() > 0 && player3.getBalance() > 0 && player4.getBalance() > 0) {
            Die die = new Die();

            if (player1.isTurnIndicator()) {
                int roll = die.roll();
                player1.setPosition(roll);
                //kald metode for felt der er landet på her
                player1.setTurnIndicator(false);
                player2.setTurnIndicator(true);
                System.out.println("player1 har rullet " + roll + " og lander på " + player1.getPosition());
                scanner.nextLine();
            }
            else if (player2.isTurnIndicator()) {
                int roll = die.roll();
                player2.setPosition(roll);
                //kald metode for felt der er landet på her
                player2.setTurnIndicator(false);
                player3.setTurnIndicator(true);
                System.out.println("player2 har rullet " + roll + " og lander på " + player2.getPosition());
                scanner.nextLine();
            }
            else if (player3.isTurnIndicator()) {
                int roll = die.roll();
                player3.setPosition(roll);
                //kald metode for felt der er landet på her
                player3.setTurnIndicator(false);
                player4.setTurnIndicator(true);
                System.out.println("player3 har rullet " + roll + " og lander på " + player3.getPosition());
                scanner.nextLine();
            }
            else if (player4.isTurnIndicator()) {
                int roll = die.roll();
                player4.setPosition(roll);
                //kald metode for felt der er landet på her
                player4.setTurnIndicator(false);
                player1.setTurnIndicator(true);
                System.out.println("player4 har rullet " + roll + " og lander på " + player4.getPosition());
                scanner.nextLine();
            }
        }
    }

    public int getPlayerAmount(){
        return this.playerAmount;
    }



}
