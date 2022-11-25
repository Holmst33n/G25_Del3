package fields;

import model.Player;

public class Jail extends Field {

    private String fieldName;
    public Jail(String fieldName){
        this.fieldName = fieldName;
    }

    public void landOnField(Player player){
        System.out.println(player.getPlayerFigure() + " er landet på " + getFieldName());
    }

    public String getFieldName(){
        return this.fieldName;
    }

}