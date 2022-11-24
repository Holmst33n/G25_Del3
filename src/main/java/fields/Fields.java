package fields;

import model.Player;

public abstract class Fields {

    public Fields() {
    }

    String fieldName;
    int fieldID;
    int owner = 0; // When a field is bought, this becomes the owning players playerID
    int cost; // Price of the Field, when bought by a player
    boolean isOwned = false;

    public Fields(String fieldName, int fieldID, int cost) {
        this.fieldName = fieldName;
        this.fieldID = fieldID;
        this.cost = cost;
        this.owner = 0;
    }
    public int landOnField(Player player) {
        System.out.println("Du er landet på " + fieldName);
        int financialConsequence = 0;

        if (player.getPlayerFigure() != this.owner) {
            if (isOwned) {
                financialConsequence = cost;
            }
            if (!isOwned) {
                owner = player.getPlayerFigure();
                isOwned = true;
                financialConsequence = cost;
            }
        }
        return financialConsequence;
    }
}
