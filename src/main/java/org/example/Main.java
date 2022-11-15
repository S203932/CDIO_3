package org.example;
import gui_main.GUI;
import org.example.GUIController;
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
