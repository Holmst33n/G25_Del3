import java.awt.*;
import java.util.*;

import gui_fields.*;
import gui_main.*;

public class Main {
    public static void main(String[] args) {

        GUI_Field[] fields = {
                new GUI_Start("Start", "Modtag M2", "Modtag M2 når du passerer", Color.WHITE,Color.BLACK),
                new GUI_Street("Burgerbaren", "M1", "Koster M1", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Pizzeriaet", "M1", "Koster M1", "M1", Color.WHITE,Color.BLACK),
                new GUI_Chance(),
                new GUI_Street("Slikbutikken", "M1", "Koster M1", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Iskiosken", "M1", "Koster M1", "M1", Color.WHITE,Color.BLACK),
                new GUI_Jail("Default", "Fængsel", "På besøg", "Fængsel", Color.WHITE,Color.BLACK),
                new GUI_Street("Museet", "M2", "Koster M2", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Biblioteket", "M2", "Koster M2", "M1", Color.WHITE,Color.BLACK),
                new GUI_Chance(),
                new GUI_Street("Skaterparken", "M2", "Koster M2", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Swimmingpoolen", "M2", "Koster M2", "M1", Color.WHITE,Color.BLACK),
                new GUI_Refuge("Default", "Gratis parkering", "Gratis parkering", "Gratis parkering", Color.WHITE,Color.BLACK),
                new GUI_Street("Spillehallen", "M3", "Koster M3", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Biografen", "M3", "Koster M3", "M1", Color.WHITE,Color.BLACK),
                new GUI_Chance(),
                new GUI_Street("Legetøjsbutikken", "M3", "Koster M3", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Dyrehandlen", "M3", "Koster M3", "M1", Color.WHITE,Color.BLACK),
                new GUI_Jail("Default", "Gå i fængsel", "Gå i fængsel", "Gå i fængsel", Color.WHITE,Color.BLACK),
                new GUI_Street("Bowlinghallen", "M4", "Koster M4", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Zoo", "M4", "Koster M4", "M1", Color.WHITE,Color.BLACK),
                new GUI_Chance(),
                new GUI_Street("Vandlandet", "M4", "Koster M4", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Strandpromenaden", "M4", "Koster M4", "M1", Color.WHITE,Color.BLACK),
        };

        GUI gui = new GUI(fields);
        GUI_Player player1 = new GUI_Player("Hund", 20);
        GUI_Player player2 = new GUI_Player("Kat", 20);
        GUI_Player player3 = new GUI_Player("Bil", 20);
        GUI_Player player4 = new GUI_Player("Skib", 20);
        gui.addPlayer(player1);
        gui.addPlayer(player2);
        gui.addPlayer(player3);
        gui.addPlayer(player4);

        /*
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

         */
    }
}
