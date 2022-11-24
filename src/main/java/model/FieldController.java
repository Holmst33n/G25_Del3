package model;
import fields.*;

public class FieldController {

    int position;
    public Fields[] generateFields(){
        return new Fields[]{
            new Start("Start"),
            new Field("Gadekøkkenet", 1, 1),
            new Field("Pizzahuset", 2, 1),
            new Chance("Chance 1"),
            new Field("Godtebutikken", 4, 1),
            new Field("Iskiosken", 5, 1),
            new Jail("Fængsel"),
            new Field("Museet", 5, 1),
            new Field("Biblioteket", 5, 1),
            new Chance("Chance 2"),
            new Field("Skaterparken", 5, 1),
            new Field("Swimmingpoolen", 5, 1),
            new FreeParking("Gratis Parkering"),
            new Field("Spillehallen", 5, 1),
            new Field("Biografen", 5, 1),
            new Chance("Chance 3"),
            new Field("Legetøjsbutik", 5, 1),
            new Field("Dyrehandlen", 5, 1),
            new GoToJail("Gå i fængsel"),
            new Field("Bowlinghallen", 5, 1),
            new Field("Zoo", 5, 1),
            new Chance("Chance 4"),
            new Field("Vandlandet", 5, 1),
            new Field("Strandpromenaden", 5, 1),
        };
    }

    public void landOnField(Player player){

        int fieldHit = player.getPosition()-1;
        switch(fieldHit){
            case 0:
                generateFields()[0].landOnField(player);
            case 1:
                generateFields()[1].landOnField(player);
            case 2:
                generateFields()[2].landOnField(player);
            case 3:
                generateFields()[3].landOnField(player);
            case 4:
                generateFields()[4].landOnField(player);
            case 5:
                generateFields()[5].landOnField(player);
            case 6:
                generateFields()[6].landOnField(player);
            case 7:
                generateFields()[7].landOnField(player);
            case 8:
                generateFields()[8].landOnField(player);
            case 9:
                generateFields()[9].landOnField(player);
            case 10:
                generateFields()[10].landOnField(player);
            case 11:
                generateFields()[11].landOnField(player);
            case 12:
                generateFields()[12].landOnField(player);
            case 13:
                generateFields()[13].landOnField(player);
            case 14:
                generateFields()[14].landOnField(player);
            case 15:
                generateFields()[15].landOnField(player);
            case 16:
                generateFields()[16].landOnField(player);
            case 17:
                generateFields()[17].landOnField(player);
            case 18:
                generateFields()[18].landOnField(player);
            case 19:
                generateFields()[19].landOnField(player);
            case 20:
                generateFields()[20].landOnField(player);
            case 21:
                generateFields()[21].landOnField(player);
            case 22:
                generateFields()[22].landOnField(player);
            case 23:
                generateFields()[23].landOnField(player);
        }
    }
}
