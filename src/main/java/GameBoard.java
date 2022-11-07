package main.java;
public class GameBoard {

    private int playerAmount = 0;

    /**
     * @param players amount of players
     */
    public GameBoard(int players){
        this.playerAmount = players;

    }

    public int getPlayerAmount(){
        return this.playerAmount;
    }


}
