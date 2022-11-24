package fields;

import model.Player;

public abstract class Fields {

    private String fieldName;
    int fieldID;
    int owner = 0; // When a field is bought, this becomes the owning players playerID
    int cost; // Price of the Field, when bought by a player
    boolean isOwned = false;

    public Fields() {
    }
    public void landOnField(Player player) {
        System.out.println(player.getPlayerFigure() + " er landet på " + getFieldName());
    }

    public String getFieldName(){
        return this.fieldName;
    }
}
