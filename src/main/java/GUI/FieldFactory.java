package GUI;

import gui_fields.*;
import gui_main.*;

import java.awt.*;

public class FieldFactory {

    public GUI_Field[] makeFields(){

        return new GUI_Field[]{
                new GUI_Start("Start", "Modtag M2", "Modtag M2 når du passerer", Color.WHITE,Color.BLACK),
                new GUI_Street("Burgerbaren", "M1", "Koster M1", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Pizzeriaet", "M1", "Koster M1", "M1", Color.WHITE,Color.BLACK),
                new GUI_Chance(),
                new GUI_Street("Slikbutikken", "M1", "Koster M1", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Iskiosken", "M1", "Koster M1", "M1", Color.WHITE,Color.BLACK),
                new GUI_Jail("Default", "Fængsel", "På besøg", "Fængsel", Color.WHITE,Color.BLACK),
                new GUI_Street("Museet", "M2", "Koster M2", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Biblioteket", "M2", "Koster M2", "M1", Color.WHITE,Color.BLACK),
                new GUI_Chance(),
                new GUI_Street("Skaterparken", "M2", "Koster M2", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Swimmingpoolen", "M2", "Koster M2", "M1", Color.WHITE,Color.BLACK),
                new GUI_Refuge("Default", "Gratis parkering", "Gratis parkering", "Gratis parkering", Color.WHITE,Color.BLACK),
                new GUI_Street("Spillehallen", "M3", "Koster M3", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Biografen", "M3", "Koster M3", "M1", Color.WHITE,Color.BLACK),
                new GUI_Chance(),
                new GUI_Street("Legetøjsbutikken", "M3", "Koster M3", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Dyrehandlen", "M3", "Koster M3", "M1", Color.WHITE,Color.BLACK),
                new GUI_Jail("Default", "Gå i fængsel", "Gå i fængsel", "Gå i fængsel", Color.WHITE,Color.BLACK),
                new GUI_Street("Bowlinghallen", "M4", "Koster M4", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Zoo", "M4", "Koster M4", "M1", Color.WHITE,Color.BLACK),
                new GUI_Chance(),
                new GUI_Street("Vandlandet", "M4", "Koster M4", "M1", Color.WHITE,Color.BLACK),
                new GUI_Street("Strandpromenaden", "M4", "Koster M4", "M1", Color.WHITE,Color.BLACK),
        };

    }

}
