package fields;
import model.Player;

public class GoToJail extends Fields{

    public void putPlayerInJail(Player player, Jail jail){
        jail.putPlayerInJail(player);
        System.out.println("Du er blevet sat i fængsel, spyttemand");
    }
    // Here we should have a setPlayersInJail(), Can't get it to work right now
    // Added that we need a setBoardPosition(), to keep track of where the player is

}
