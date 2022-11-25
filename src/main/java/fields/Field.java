package fields;

import model.Player;

public abstract class Field {

    private String fieldName = "derp";
    int fieldID;
    int owner = 0; // When a field is bought, this becomes the owning players playerID
    int cost; // Price of the Field, when bought by a player
    boolean isOwned = false;

    public Field() {
    }
    public void landOnField(Player player) {
    }

    public String getFieldName(){
        return this.fieldName;
    }
}
