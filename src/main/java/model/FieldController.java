package model;
import fields.*;

public class FieldController {

    int position;
    Field[] fields;
    public FieldController(){
        fields = new Field[]{
            new Start("Start"),
            new Property("Gadekøkkenet", 1, 1),
            new Property("Pizzahuset", 2, 1),
            new Chance("Chance 1"),
            new Property("Godtebutikken", 4, 1),
            new Property("Iskiosken", 5, 1),
            new Jail("Fængsel"),
            new Property("Museet", 7, 2),
            new Property("Biblioteket", 8, 2),
            new Chance("Chance 2"),
            new Property("Skaterparken", 10, 2),
            new Property("Swimmingpoolen", 11, 2),
            new FreeParking("Gratis Parkering"),
            new Property("Spillehallen", 13, 3),
            new Property("Biografen", 14, 3),
            new Chance("Chance 3"),
            new Property("Legetøjsbutik", 16, 3),
            new Property("Dyrehandlen", 17, 3),
            new GoToJail("Gå i fængsel"),
            new Property("Bowlinghallen", 19, 4),
            new Property("Zoo", 20, 4),
            new Chance("Chance 4"),
            new Property("Vandlandet", 22, 5),
            new Property("Strandpromenaden", 23, 5),
        };
    }

    public void landOnField(Player player){
        int fieldHit = player.getPosition()-1;
        switch(fields[fieldHit].getClass().getSimpleName()){
            case "Field" -> {
                Property property = (Property) fields[fieldHit];
                property.landOnField(player);
            }


            default:
                System.out.println("noget gik galt");
        }
    }
}
