package fields;

import model.Player;

public class Field extends Fields {
    private String fieldName;
    private int fieldID;
    private int owner = 0; // When a field is bought, this becomes the owning players playerID
    private int cost; // Price of the Field, when bought by a player
    private boolean isOwned = false;

    public Field(String fieldName, int fieldID, int cost) {
        this.fieldName = fieldName;
        this.fieldID = fieldID;
        this.cost = cost;
        this.owner = 0;
    }
    @Override
    public void landOnField(Player player) {
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
        player.setBalance(financialConsequence);
    }
}
