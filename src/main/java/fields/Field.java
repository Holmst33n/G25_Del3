package fields;

public class Field extends Fields {
    String fieldName;
    int fieldID;
    int owner = 0; // When a field is bought, this becomes the owning players playerID
    int cost; // Price of the Field, when bought by a player
    boolean isOwned = false;

    public Field(String fieldName, int fieldID, int cost) {
        this.fieldName = fieldName;
        this.fieldID = fieldID;
        this.cost = cost;
        this.owner = 0;
    }
    public int landOnField(int playerId) {
        int financialConsequence = 0;
        System.out.println("Du er landet på " + fieldName);

        if (playerId != this.owner) {
            if (isOwned) {
                financialConsequence = cost;
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
