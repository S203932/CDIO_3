package Game;

import Fields.FieldList;
import SupportClasses.Player;
import org.example.GUIController;

import java.sql.SQLOutput;

public class Game {
    public static void main(String[] args){
        //Lets see if we can make this trash pile run


        GUIController guiController= new GUIController();
        String language = guiController.getGui().getUserSelection(
                "Language",
                "Dansk", "Engelsk","عربي"
        );
        language=language+".txt";

        System.out.println(language);
        guiController.GUIController(language);
        FieldList fieldList = new FieldList();
        Player[] players = guiController.setupPlayers();







    }
}
