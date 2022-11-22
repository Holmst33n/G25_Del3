package fields;

public class Field extends Fields {
    String fieldName;
    int fieldID;
    int owner; // When a field is bought, this becomes the owning players playerID
    int cost; // Price of the Field, when bought by a player
    int rent; // The fee competing players will have to pay if the land on the field
    boolean isOwned = false;

    public Field(String fieldName, int fieldID, int owner, int cost, int rent) {
        this.fieldName = fieldName;
        this.fieldID = fieldID;
        this.owner = owner;
        this.cost = cost;
        this.rent = rent;
    }
    public int landOnField(int playerId) {
        int financialConsequence = 0;

        if (playerId != this.owner) {
            if (isOwned) {
                financialConsequence = rent;
            }
            if (!isOwned) {
                owner = playerId;
                isOwned = true;
                financialConsequence = cost;
            }
        }
        return financialConsequence;
    }
}
