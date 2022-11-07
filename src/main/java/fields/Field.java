package fields;

public class Field extends Fields {
    String fieldName;
    int fieldID;
    int owner; // When a field is bought, this becomes the owning players playerID
    int cost;
    int fee;
    boolean isOwned = false;
    public Field (String fieldName, int fieldID, int owner, int cost, int fee){
        this.fieldName = fieldName;
        this.fieldID = fieldID;
        this.owner = owner;
        this.cost = cost;
        this.fee = fee;
    }
    public int buyField(int playerID){
        owner = playerID;
        isOwned = true;
        return cost;
    }
    public int landOnOwnedField(){
        int feeToBePaid = 0;
        if (isOwned){
            feeToBePaid = fee;
        }
        return feeToBePaid;
    }

}
