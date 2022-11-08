package fields;
public class Jail {

    int bail = 1;
    int[] playersInJail = new int[4];
    public int freePlayer(Boolean isInjail){

        if(isInjail)
            isInjail = false;
            return bail;
    }

    public void setPlayersInJail(int[] playersInJail) {
        this.playersInJail = playersInJail;
    }
}
