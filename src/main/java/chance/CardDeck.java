package chance;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

    //ACT står for action
    public static final int ACT_MOVE = 0;
    public static final int ACT_RECEIVE = 1;
    public static final int ACT_PAY = 2;
    public static final int ACT_GO_TO_JAIL = 3;
    public static final int ACT_LEAVE_JAIL = 4;
    public static final int ACT_MOVE_FORWARD = 5;

    ArrayList<Cards> cards = new ArrayList<Cards>();

    public void add (Cards card) {
        cards.add(card);
        return;
    }
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
