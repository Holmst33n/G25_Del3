package chance;
public class Cards {

    //Objects to define chance cards
    private int type;
    private String desc;
    private int action;
    private int parameter;

    Cards () {
        desc = "";
        return;
    }
    //Method for simple chance cards
    Cards (int type, String desc, int action) {
        this.type = type;
        this.desc = desc;
        this.action = action;
        return;
    }
    //Method for chance cards involving currency
    Cards (int type, String desc, int action, int parameter) {
        this.type = type;
        this.desc = desc;
        this.action = action;
        this.parameter = parameter;
        return;
    }
    //Getters
    public int getType () {
        return type;
    }
    public int getAction () {
        return action;
    }
    public int getAmount () {
        return parameter;
    }
    public int getDestination () {
        return parameter;
    }
    public int getNumSpaces() {
        return parameter;
    }
    public String toString () {
        return desc;
    }
}