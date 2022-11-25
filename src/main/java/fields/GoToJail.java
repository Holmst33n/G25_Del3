package fields;
import model.Player;

public class GoToJail extends Field {

    private String fieldName;
    public GoToJail(String fieldName){
        this.fieldName = fieldName;
    }

    @Override
    public void landOnField(Player player){
        System.out.println("Spiller " + player.getPlayerFigure() + " er landet på " + getFieldName() + ". Du betaler 1 for at komme ud");
        player.setRealPosition(7);
        if(player.hasOutOfJailCard()) {
            player.setOutOfJailCard(false);
        }
        else{
            player.setBalance(-1);
        }
    }

    public String getFieldName(){
        return this.fieldName;
    }

    // Here we should have a setPlayersInJail(), Can't get it to work right now
    // Added that we need a setBoardPosition(), to keep track of where the player is

}
