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

    public void landOnField(Player player, Player secondPlayer, Player thirdPlayer, Player fourthPlayer) {
        System.out.println("Spiller " + player.getPlayerFigure() + " er landet på " + getFieldName());

        if (this.isOwned && player.getPlayerFigure() == this.owner) {
            System.out.println("Du hænger ud på din egen grund");
        }

        else if (this.isOwned && player.getPlayerFigure() != this.owner) {
            System.out.println("Spiller " + player.getPlayerFigure() + " betaler " + this.cost + " i leje til spiller " + this.owner);
            if(this.owner == secondPlayer.getPlayerFigure()){
                secondPlayer.addBalance(this.cost);
            }
            else if(this.owner == thirdPlayer.getPlayerFigure()){
                thirdPlayer.addBalance(this.cost);
            }
            else if(this.owner == fourthPlayer.getPlayerFigure()){
                fourthPlayer.addBalance(this.cost);
            }
        }

        else if (!this.isOwned) {
            this.owner = player.getPlayerFigure();
            this.isOwned = true;
            System.out.println("Spiller " + player.getPlayerFigure() + " køber grunden for " + this.cost);
        }
        player.setBalance(this.cost);
    }

    public String getFieldName(){
        return this.fieldName;
    }
}
