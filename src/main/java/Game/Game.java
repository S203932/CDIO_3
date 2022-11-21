package Game;

import Fields.FieldList;
import Fields.Property;
import SupportClasses.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
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
        int amountPlayers = guiController.getGui().getUserInteger("Indtast antal spiller", 2, 4);
        Player[] players = new Player[amountPlayers];
        GUI_Player[] gui_players = guiController.setupPlayers(players);
        FieldList fieldList = new FieldList();
        fieldList.setupField(language);
        guiController.takeTurn(players[0],guiController.getGui(),gui_players[0],fieldList, guiController.getGUI_Fields());

        System.out.println(players[0].getProperty()[0]);
        System.out.println(players[0].getPosition());
        System.out.println(players[0].getPlayerName());
        System.out.println(players[0].getAccount().getPengebeholdning());

        for(int i=0;gui_players.length>i;i++){
            gui_players[i].setBalance(players[i].getAccount().getPengebeholdning());
        }








    }
}
