package fields;

import model.Player;

public class Start extends Field {

    private String fieldName;

    public Start(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public void landOnField(Player player){
        System.out.println("Spiller " + player.getPlayerFigure() + " er landet på " + getFieldName());
    }

    public String getFieldName(){
        return this.fieldName;
    }


    // Her skal der være en setBalance() som giver den pågældende spiller 2M mere

}
