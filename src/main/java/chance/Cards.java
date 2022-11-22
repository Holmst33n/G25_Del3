package chance;
import java.util.HashMap;
public class Cards {
    String description;
    int value;

    Cards(String desc, int value) {
        this.description = desc;
        this.value = value;
    }
    public String getDescription(){
    }
    public int getValue(){
    }
    //Idéen med koden her er at:
    //Overstående skal bruges til basale kort med én handling
    //Understående skal bruges til kort med flere handlinger f.eks. Ryk x felter tilbage og betal x penge
    public String text;
    public HashMap<String, Integer> actions;
    Cards(String text) {
        this.text = text;
        actions = new HashMap<String, Integer>();
    }
    addAction(String action, int value) {
        actions.put(action, value);
    }
    //Der skal tilføjes cardDraw metode her

}