package chance;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

    //ACT is short for action
    //Action objects
    public static final int ACT_MOVE = 0;
    public static final int ACT_RECEIVE = 1;
    public static final int ACT_PAY = 2;
    public static final int ACT_LEAVE_JAIL = 3;
    public static final int ACT_MOVE_FORWARD = 4;

    //Array of cards
    ArrayList<Cards> cards = new ArrayList<Cards>();

    //Method for adding chance cards
    public void add (Cards card) {
        cards.add(card);
        return;
    }

    //Method for shuffling the 'deck' of cards
    public void shuffle () {
        Collections.shuffle(cards);
        return;
    }
    public Cards get () {
        Cards card = cards.get(0);
        cards.remove(0);
        return card;
    }
    public Cards put (Cards card) {
        cards.add(card);
        return card;
    }
}
