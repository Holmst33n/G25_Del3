package chance;

public class ChanceDeck extends CardDeck{

    public static final int CHANCE_CARD = 0;

    //Deck of chance cards
    ChanceDeck () {

        //Movement
        cards.add(new Cards(CHANCE_CARD, "Ryk 5 felter frem.", ACT_MOVE, +5));
        cards.add(new Cards(CHANCE_CARD, "Ryk frem til Strandpromenaden.", ACT_MOVE_FORWARD));
        cards.add(new Cards(CHANCE_CARD, "Ryk frem til Skaterparken", ACT_MOVE_FORWARD));


        //Fines
        cards.add(new Cards(CHANCE_CARD, "Du har spist for meget slik. BETAL M2 til banken.", ACT_PAY, -2));

        //Payments
        cards.add(new Cards(CHANCE_CARD, "Du har lavet alle dine lektier! MODTAG M2 fra banken.", ACT_RECEIVE, +2));


        //Jail
        cards.add(new Cards(CHANCE_CARD, "Du løslades fra fængslet uden omkostninger.", ACT_LEAVE_JAIL));

        shuffle();

        return;
    }
}
