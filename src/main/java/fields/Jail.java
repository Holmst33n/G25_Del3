package fields;
public class Jail {
    final int bail = 1;
    int[] playersInJail = new int[4];
    public int freePlayer(Boolean isInJail){
        if(isInJail == null){
            System.out.println("Error: Player isInJail status unknown");
        }
        if(isInJail){
            isInJail = false;
        return bail;
    }

    public void setPlayersInJail(int[] playersInJail) {
        this.playersInJail = playersInJail;
    }
}
