package fields;

import model.Player;

public class FreeParking extends Field {

    private String fieldName;
    public FreeParking(String fieldName){
        this.fieldName = fieldName;
    }

    public void landOnField(Player player){
        System.out.println("Spiller " + player.getPlayerFigure() + " er landet på " + getFieldName());
    }

    public String getFieldName(){
        return this.fieldName;
    }

    /// Nothing happens in FreeParking

}
