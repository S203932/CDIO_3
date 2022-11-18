package org.example;
import Fields.Field;
import Fields.NeutralField;
import Fields.Property;
import Fields.*;
import SupportClasses.Player;
import gui_main.GUI;

public class Main {
    public static void main(String[] args) {
         GUIController guiController= new GUIController();
         guiController.GUIDice();
         guiController.GUIController();
         int amountPlayers = guiController.show();

        FieldList fieldList = new FieldList();


        System.out.println(fieldList.getFieldIndex(2).getClass());
        System.out.println("Value of property is: "+((Property)fieldList.getFieldIndex(2)).getValue());

        }

    public Player[] initialzePlayers(int amountPlayers, GUI gui) {
        Player[] players=new Player[amountPlayers];

        if (amountPlayers==2){
            for (int i = 0; i < players.length; i++ ){
                players[i]=new Player();
                players[i].getAccount().setAccount(20);
                players[i].setPlayerName(gui.getUserString("Indtast navn"));
            }
        } else if(amountPlayers==3){
            for (int i = 0; i < players.length; i++ ){
            players[i]=new Player();
            players[i].getAccount().setAccount(18);
            players[i].setPlayerName(gui.getUserString("Indtast navn"));
        }
        } else if(amountPlayers==4){
            for (int i = 0; i < players.length; i++ ){
                players[i]=new Player();
                players[i].getAccount().setAccount(16);
                players[i].setPlayerName(gui.getUserString("Indtast navn"));
            }
        }
        return players;
    }
}
