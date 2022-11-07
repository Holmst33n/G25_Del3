package chance;
public class Cards {

    public String desc;
    public HashMap<String, Integer> actions;

    Cards (String desc) {
        this.desc = desc;
        actions = new HashMap<String, Integer>();
    }
    public addAction(String action, int value) {
        actions.put(action, value);
    }
}