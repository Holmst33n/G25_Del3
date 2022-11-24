package fields;
import model.Player;

public class GoToJail extends Fields{

    private String fieldName;
    public GoToJail(String fieldName){
        this.fieldName = fieldName;
    }

    @Override
    public void landOnField(Player player){
        player.setRealPosition(7);
        if(player.hasOutOfJailCard()) {
            player.setOutOfJailCard(false);
        }
        else{
            player.setBalance(-1);
        }
        System.out.println("Du er blevet sat i fængsel, spyttemand");
    }

    // Here we should have a setPlayersInJail(), Can't get it to work right now
    // Added that we need a setBoardPosition(), to keep track of where the player is

}
