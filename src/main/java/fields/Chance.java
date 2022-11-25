package fields;


import model.Player;

public class Chance extends Field {

    private String fieldName;

    public Chance(String fieldName){
        this.fieldName = fieldName;
    }

    public void landOnField(Player player){
        System.out.println("Spiller " + player.getPlayerFigure() + " er landet på " + getFieldName());
    }
    public String getFieldName(){
        return this.fieldName;
    }


    // Here we will have a "draw card function" Should be made in game controller

}
