package fields;

import model.Player;

public class Jail extends Fields{
    final int bail = 1;

    public void putPlayerInJail(Player player){
        player.setInJail(true);
        player.setRealPosition(7);
        player.setBalance(-2);
    }

    public void freePlayer(Player player) {
        player.setInJail(false);
    }
}