package main.java;

public class Player {

    private boolean turnIndicator;
    private boolean hasLost = false;
    private int playerFigure;
    private String playerName;

    /**
     * @param playerFigure 1-4
     */
    public Player(int playerFigure) {       //constructor
        this.turnIndicator = false;
        this.playerFigure = playerFigure;
    }
    Account account = new Account();

    public int getBalance() {       //getter
        return account.getBalance();
    }

    public void setBalance(int amount) {       //setter
        account.setBalance(amount);
        if (account.checkIfLost()) {
            this.hasLost = true;
        }
    }

    public int getPlayerFigure(){
        return this.playerFigure;
    }

    public void setPlayerLost(){
        this.hasLost = true;
    }

    public void setTurnIndicator(boolean turnIndicator) {       //sets turnIndicator to either true or false
        this.turnIndicator = turnIndicator;
    }

    public boolean isTurnIndicator() {     //gets turnIndicator
        return turnIndicator;
    }

    public void setPlayerName(String name){
        this.playerName = name;
    }

    public String getPlayerName(){
        return playerName;
    }

}
