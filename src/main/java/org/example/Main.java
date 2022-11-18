package org.example;
import Fields.Field;
import Fields.NeutralField;
import Fields.Property;
import Fields.*;
import SupportClasses.Player;

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

    private void initialzePlayers(int amountPlayers) {
        Player[] players=new Player[amountPlayers];

        if (amountPlayers==2){
            for (int i = 0; i < players.length; i++ ){
                players[i]=new Player();
            }
        }
    }
}
    /*
        private void spilSpillet(int antalSpillere, int maxTure) {
        // Initialiser spillere.
        // ---------------------
        Spiller[] spillere = new Spiller[antalSpillere];
        for (int i = 0; i < spillere.length; i++) {
            spillere[i] = new Spiller(15000);
        }
     */
