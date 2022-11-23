package model;

public class Player {

    private boolean turnIndicator;
    private boolean hasLost = false;
    private int playerFigure;
    private String playerName;

    private boolean outOfJailCard = false;

    public boolean hasOutOfJailCard() {
        return outOfJailCard;
    }

    public void setOutOfJailCard(boolean outOfJail) {
        this.outOfJailCard = outOfJail;
    }

    private int position = 0;
    private boolean inJail;


    /**
     * @param playerFigure 1-4
     */
    public Player(int playerFigure, String playerName) {       //constructor
        this.turnIndicator = false;
        this.playerFigure = playerFigure;
        this.playerName = playerName;
    }
    Account account = new Account();

    public int getBalance() {       //getter
        return account.getBalance();
    }

    //sets balance of player
    public void setBalance(int amount) {       //setter
        account.setBalance(amount);
        if (account.checkIfLost()) {
            this.hasLost = true;
        }
    }

    public int getPlayerFigure(){
        return this.playerFigure;
    }

    //method to mark a player as lost
    public void setPlayerLost(){
        this.hasLost = true;
    }

    //method to set a players turn to true or false
    public void setTurnIndicator(boolean turnIndicator) {       //sets turnIndicator to either true or false
        this.turnIndicator = turnIndicator;
    }

    //method to check if it's a player's turn
    public boolean isTurnIndicator() {     //gets turnIndicator
        return turnIndicator;
    }

    //gets position of player
    public int getPosition() {
        return position;
    }

    //moves player to the next position
    public void setPosition(int position) {
        this.position += position;
        if(this.position > 24){
            this.position = this.position-24;
            this.setBalance(2);
        }
    }

    //sets position of player to a set position
    public void setRealPosition(int position){
        this.position = position;
    }

    public void setInJail(boolean b) {

        this.inJail = b;

    }

    public boolean isInJail() {
        return inJail;
    }
}
