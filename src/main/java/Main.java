import java.awt.*;
import java.util.*;

import gui_fields.*;;
import gui_main.*;

public class Main {
    public static void main(String[] args) {

        GUI_Field[] fields = {
                new GUI_Start(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Jail(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Refuge(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Jail(),
                new GUI_Street(),
                new GUI_Street(),
                new GUI_Chance(),
                new GUI_Street(),
                new GUI_Street(),
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

        GUI_Field start = gui.getFields()[0];
        start.setTitle("Start");
        start.setSubText("Modtag 2M");
        start.setBackGroundColor(Color.WHITE);

        GUI_Field burgerbaren = gui.getFields()[1];
        burgerbaren.setTitle("Burgerbaren");
        burgerbaren.setSubText("M1");

        GUI_Field pizzeriaet = gui.getFields()[2];
        pizzeriaet.setTitle("Pizzeriaet");
        pizzeriaet.setSubText("M1");

        GUI_Field slikbutikken = gui.getFields()[4];
        slikbutikken.setTitle("Slikbutikken");
        slikbutikken.setSubText("M1");

        GUI_Field iskiosken = gui.getFields()[5];
        iskiosken.setTitle("Iskiosken");
        iskiosken.setSubText("M1");

        GUI_Field fængsel = gui.getFields()[6];
        fængsel.setSubText("Fængsel");

        GUI_Field museet = gui.getFields()[7];
        museet.setTitle("Museet");
        museet.setSubText("M2");

        GUI_Field biblioteket = gui.getFields()[8];
        biblioteket.setTitle("Biblioteket");
        biblioteket.setSubText("M2");

        GUI_Field skaterparken = gui.getFields()[10];
        skaterparken.setTitle("Skaterparken");
        skaterparken.setSubText("M2");

        GUI_Field swimmingpoolen = gui.getFields()[11];
        swimmingpoolen.setTitle("Swimmingpoolen");
        swimmingpoolen.setSubText("M2");

        GUI_Field freeparking = gui.getFields()[12];
        freeparking.setTitle("Gratis Parkering");

        GUI_Field spillehallen = gui.getFields()[13];
        spillehallen.setTitle("Spillehallen");
        spillehallen.setSubText("M3");

        GUI_Field biografen = gui.getFields()[14];
        biografen.setTitle("Biografen");
        biografen.setSubText("M3");

        GUI_Field legetøjsbutikken = gui.getFields()[16];
        legetøjsbutikken.setTitle("Legetøjsbutikken");
        legetøjsbutikken.setSubText("M3");

        GUI_Field dyrebutikken = gui.getFields()[17];
        dyrebutikken.setTitle("Dyrebutikken");
        dyrebutikken.setSubText("M3");

        GUI_Field gåifængsel = gui.getFields()[18];
        gåifængsel.setSubText("Gå i fængsel");

        GUI_Field bowlinghallen = gui.getFields()[19];
        bowlinghallen.setTitle("Bowlinghallen");
        bowlinghallen.setSubText("M4");

        GUI_Field zoo = gui.getFields()[20];
        zoo.setTitle("Zoo");
        zoo.setSubText("M4");

        GUI_Field vandlandet = gui.getFields()[22];
        vandlandet.setTitle("Vandlandet");
        vandlandet.setSubText("M4");

        GUI_Field strandpromenaden = gui.getFields()[23];
        strandpromenaden.setTitle("Strandpromenaden");
        strandpromenaden.setSubText("M4");

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
