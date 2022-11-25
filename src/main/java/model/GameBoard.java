package model;

import java.sql.SQLOutput;
import java.util.Scanner;
import fields.*;

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

        FieldController fieldController = new FieldController();
        fieldController.generateFields();

        while(player1.getBalance() > 0 && player2.getBalance() > 0 && player3.getBalance() > 0 && player4.getBalance() > 0) {
            Die die = new Die();

            if (player1.isTurnIndicator()) {
                int i = die.roll();
                System.out.println("Spiller 1 slår " + i);
                player1.setPosition(i);
                player1.setTurnIndicator(false);
                player2.setTurnIndicator(true);
                fieldController.landOnField(player1);
                System.out.println("Spiller 1's balance: " + player1.getBalance());
                scanner.nextLine();
            }
            else if (player2.isTurnIndicator()) {
                int i = die.roll();
                System.out.println("Spiller 2 slår " + i);
                player2.setPosition(i);
                player2.setTurnIndicator(false);
                player3.setTurnIndicator(true);
                fieldController.landOnField(player2);
                System.out.println("Spiller 2's balance: " + player2.getBalance());
                scanner.nextLine();
            }
            else if (player3.isTurnIndicator()) {
                int i = die.roll();
                System.out.println("Spiller 3 slår " + i);
                player3.setPosition(i);
                player3.setTurnIndicator(false);
                player4.setTurnIndicator(true);
                fieldController.landOnField(player3);
                System.out.println("Spiller 3's balance: " + player3.getBalance());
                scanner.nextLine();
            }
            else if (player4.isTurnIndicator()) {
                int i = die.roll();
                System.out.println("Spiller 4 slår " + i);
                player4.setPosition(i);
                player4.setTurnIndicator(false);
                player1.setTurnIndicator(true);
                fieldController.landOnField(player4);
                System.out.println("Spiller 4's balance: " + player4.getBalance());
                scanner.nextLine();
            }
        }
    }

    public int getPlayerAmount(){
        return this.playerAmount;
    }



}
