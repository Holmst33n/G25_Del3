package main.java;

public class Player {

    private boolean turnIndicator;
    private int playerFigure;

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

    public void setBalance(int balance) {       //setter
        //mangler method body
    }

    public void setTurnIndicator(boolean turnIndicator) {       //sets turnIndicator to either true or false
        this.turnIndicator = turnIndicator;
    }

    public boolean isTurnIndicator() {     //gets turnIndicator
        return turnIndicator;
    }
}
