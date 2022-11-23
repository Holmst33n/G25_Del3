package chance;

public abstract class ChanceController {

    public static void generateChanceCardDeck(){
    Cards[] chanceCards = new Cards[20];

    chanceCards[0] = new MoveDog();
    chanceCards[1] = new MoveCat();
    chanceCards[2] = new MoveShip();
    chanceCards[3] = new MoveCar();
    chanceCards[4] = new FreeFieldBrownOrYellow();
    chanceCards[5] = new FreeFieldLightBlue();
    chanceCards[6] = new FreeFieldLightBlueOrRed();
    chanceCards[7] = new FreeFieldOrange();
    chanceCards[8] = new FreeFieldOrangeOrGreen();
    chanceCards[9] = new FreeFieldRed();
    chanceCards[10] = new FreeFieldPinkOrDarkBlue();
    chanceCards[11] = new StartMove();
    chanceCards[12] = new MoveMax5();
    chanceCards[13] = new MoveOrDraw();
    chanceCards[14] = new CandyOverload();
    chanceCards[15] = new Birthday();
    chanceCards[16] = new HomeWorkDone();
    chanceCards[17] = new MoveSkatepark();
    chanceCards[18] = new MovePeer();
    chanceCards[19] = new GetOutOfJailFree();

    }

    public static void drawcard(){
        int min = 1;
        int max = 20;
        int a = (int)(Math.random()*(max-min+1)+min);

        chanceCards[a-1]

    }
}
