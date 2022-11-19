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
        // guiController.GUIDice();
         //guiController.GUIController();
       //  int amountPlayers = guiController.show();

        FieldList fieldList = new FieldList();


        System.out.println(fieldList.getFieldIndex(2).getClass());
        System.out.println("Value of property is: "+((Property)fieldList.getFieldIndex(2)).getValue());

        }


}
