package fields;

 public class Jail extends Fields{
    final int bail = 1;

     public boolean isPlayerOneIsInJail() {
         return playerOneIsInJail;
     }
     public boolean isPlayerTwoIsInJail() {
         return playerTwoIsInJail;
     }
     public boolean isPlayerThreeIsInJail() {
         return playerThreeIsInJail;
     }
     public boolean isPlayerFourIsInJail() {
         return playerFourIsInJail;
     }

     boolean playerOneIsInJail;
    boolean playerTwoIsInJail;
    boolean playerThreeIsInJail;
    boolean playerFourIsInJail;

    public void putPlayerInJail(int playerId){
        if(playerId == 1){
            playerOneIsInJail = true;
            player1.setJailPosition();
            //disse skal fikses
        }
        if(playerId == 2){
            playerTwoIsInJail = true;
            player2.setJailPosition();
        }
        if(playerId == 3){
            playerThreeIsInJail = true;
            player3.setJailPosition();
        }
        if(playerId == 4){
            playerFourIsInJail = true;
            player4.setJailPosition();
        }
    }

    public int freePlayer(int playerID) {

        if (playerID == 1) {
            if (!playerOneIsInJail) {
                System.out.println("This player is not in jail");
            }
            playerOneIsInJail = false;
        }
        else if (playerID == 2) {
            if (!playerTwoIsInJail) {
                System.out.println("This player is not in jail");
            }
            playerTwoIsInJail = false;
        }
        else if (playerID == 3) {
            if (!playerThreeIsInJail) {
                System.out.println("This player is not in jail");
            }
            playerThreeIsInJail = false;
        }
            else if (playerID == 4) {
            if (!playerFourIsInJail) {
                System.out.println("This player is not in jail");
            }
            playerFourIsInJail = false;
        }
        return bail;
    }

}
