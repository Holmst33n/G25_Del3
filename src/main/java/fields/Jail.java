package fields;
public class Jail {
    int bail = 0;
    int[] playersInJail = new int[4];
    public int freePlayer(Boolean isInJail){
        if(isInJail == null){
            System.out.println("Error: Player isInJail status unknown");
        }
        if(isInJail){
            isInJail = false;
            bail = 1;
        }
        return bail;
    }

    public void setPlayersInJail(int[] playersInJail) {
        this.playersInJail = playersInJail;
    }
}
