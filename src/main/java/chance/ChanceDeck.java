package chance;

public class ChanceDeck extends CardDeck{

    public static final int CHANCE_CARD = 0;
    ChanceDeck () {

        //Movement
        cards.add(new Cards(CHANCE_CARD, "Ryk 5 felter frem.", ACT_MOVE));


        //Fines
        cards.add(new Cards(CHANCE_CARD, "Du har spist for meget slik. BETAL" + "M2" + "til banken.", ACT_PAY));

        //Payments


        //Jail
        cards.add(new Cards(CHANCE_CARD, "Du løslades fra fængslet uden omkostninger.", ACT_LEAVE_JAIL));
    }
}
