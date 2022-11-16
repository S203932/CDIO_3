package org.example;
import Fields.Field;
import Fields.NeutralField;
import Fields.Property;

public class Main {
    public static void main(String[] args) {
//            GUIController guiController= new GUIController();
//            guiController.GUIDice();
//            guiController.GUIController();
//
            Field[] fields = new Field[2];
            fields[0] = new NeutralField();
            fields[1] = new Property();

        for (Field f: fields
             ) {
            System.out.println(f);

        }

        }
    }
