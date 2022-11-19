package Game;

import Fields.FieldList;
import org.example.GUIController;

import java.sql.SQLOutput;

public class Game {
    public static void main(String[] args){
        //Lets see if we can make this trash pile run


        GUIController guiController= new GUIController();
        guiController.GUIDice();
        String language = guiController.getGui().getUserSelection(
                "Language",
                "Dansk", "Engelsk","عربي"
        );
        language=language+".txt";

        System.out.println(language);
        guiController.GUIController(language);
        guiController.initialzePlayers();



        FieldList fieldList = new FieldList();


    }
}
