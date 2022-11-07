package main.java;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast antallet af spillere (2-4): ");

        int spillere = scanner.nextInt();
        GameBoard gameBoard = new GameBoard(spillere);


        if (gameBoard.getPlayerAmount() == 2) {
            Player player1 = new Player(1);
            System.out.println("Indtast spiller 1's navn: ");
            player1.setPlayerName(scanner.next());
            player1.setTurnIndicator(true);

            Player player2 = new Player(2);
            System.out.println("Indtast spiller 2's navn: ");
            player2.setPlayerName(scanner.next());
        }
        else if (gameBoard.getPlayerAmount() == 3) {
            Player player1 = new Player(1);
            System.out.println("Indtast spiller 1's navn: ");
            player1.setPlayerName(scanner.next());
            player1.setTurnIndicator(true);

            Player player2 = new Player(2);
            System.out.println("Indtast spiller 2's navn: ");
            player2.setPlayerName(scanner.next());

            Player player3 = new Player(3);
            System.out.println("Indtast spiller 3's navn: ");
            player3.setPlayerName(scanner.next());
        }
        else if (gameBoard.getPlayerAmount() == 4) {
            Player player1 = new Player(1);
            System.out.println("Indtast spiller 1's navn: ");
            player1.setPlayerName(scanner.next());
            player1.setTurnIndicator(true);

            Player player2 = new Player(2);
            System.out.println("Indtast spiller 2's navn: ");
            player2.setPlayerName(scanner.next());

            Player player3 = new Player(3);
            System.out.println("Indtast spiller 3's navn: ");
            player3.setPlayerName(scanner.next());

            Player player4 = new Player(4);
            System.out.println("Indtast spiller 4's navn: ");
            player4.setPlayerName(scanner.next());
        }
        else{
            System.out.println("Der skal være 2-4 spillere.");
        }
    }
}
