package chance;
import java.util.HashMap;
public class Cards {

    private int type;
    private String desc;
    private int action;
    private int parameter;

    Cards () {
        desc = "";
        return;
    }
    Cards (int type, String desc, int action) {
        this.type = type;
        this.desc = desc;
        this.action = action;
        return;
    }
    Cards (int type, String desc, int action, int parameter) {
        this.type = type;
        this.desc = desc;
        this.action = action;
        this.parameter = parameter;
        return;
    }
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