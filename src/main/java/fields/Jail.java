package fields;

import model.Player;

public class Jail extends Fields{

    public void putPlayerInJail(Player player){
        player.setInJail(true);
        player.setRealPosition(7);
        if(player.hasOutOfJailCard()) {
            player.setOutOfJailCard(false);
        }
        else{
            player.setBalance(-1);
        }
    }

    public void freePlayer(Player player) {
        player.setInJail(false);
    }
}