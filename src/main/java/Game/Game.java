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
                "Dansk", "English","Arabisk"
        );
        language=language+".txt";

        System.out.println(language);
        guiController.GUIController(language);
        int amountPlayers = guiController.getGui().getUserInteger("Insert amount of players", 2, 4);
        Player[] players = new Player[amountPlayers];
        GUI_Player[] gui_players = guiController.setupPlayers(players);
        FieldList fieldList = new FieldList();
        fieldList.setupField(language);
        int end = 0;
        while (end!=1){
            for(int j = 0; j<players.length;j++){
                gui_players[j].setBalance(players[j].getAccount().getPengebeholdning());
            }
            for(int i = 0;i<players.length;i++){
                if(players[i].getForfeit()==0){
                    guiController.takeTurn(players[i],guiController.getGui(),gui_players[i],fieldList, guiController.getGUI_Fields());
                    System.out.println(players[i].getPlayerName()+"'s properties: "+players[i].getProperty()[i]);
                    System.out.println(players[i].getPlayerName()+"'s position: "+players[i].getPosition());
                    System.out.println(players[i].getPlayerName()+"'s name: "+players[i].getPlayerName());
                    System.out.println(players[i].getPlayerName()+"'s money balance: "+players[i].getAccount().getPengebeholdning());
                    for(int j = 0; j<players.length;j++){
                        gui_players[j].setBalance(players[j].getAccount().getPengebeholdning());
                    }
                }


                if(players[i].getAccount().getPengebeholdning() <= 0){
                    end = 1;
                    break;
                }
            }

        }
        guiController.getGui().showMessage("Game is over.");



        //for(int i=0;gui_players.length>i;i++){
        //    gui_players[i].setBalance(players[i].getAccount().getPengebeholdning());
        //}








    }
}
