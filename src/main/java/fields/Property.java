package fields;

import model.Player;

public class Property extends Field {
    private String fieldName;
    private int fieldID;
    private int owner = 0; // When a field is bought, this becomes the owning players playerID
    private int cost; // Price of the Field, when bought by a player
    private boolean isOwned = false;

    public Property(String fieldName, int fieldID, int cost) {
        this.fieldName = fieldName;
        this.fieldID = fieldID;
        this.cost = cost;
        this.owner = 0;
    }
    @Override
    public void landOnField(Player player) {
        System.out.println(player.getPlayerFigure() + " er landet på " + getFieldName());
        int financialConsequence = 0;

        if (isOwned && player.getPlayerFigure() == owner) {
            System.out.println("Du hænger ud på din egen grund");
        }

        else if (isOwned && player.getPlayerFigure() != owner) {
            financialConsequence = cost;
            System.out.println("Spiller " + player.getPlayerFigure() + " betaler " + financialConsequence + " i leje til spiller " + this.owner);
        }

        else if (!isOwned) {
            owner = player.getPlayerFigure();
            this.isOwned = true;
            financialConsequence = cost;
            System.out.println("Spiller " + player.getPlayerFigure() + " køber grunden for " + financialConsequence);
        }
        player.setBalance(financialConsequence);
    }

    public String getFieldName(){
        return this.fieldName;
    }
}
