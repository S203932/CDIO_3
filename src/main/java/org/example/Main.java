package org.example;
import SuportClasses.Spiller;
import gui_main.GUI;
import org.example.GUIController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            GUIController guiController= new GUIController();
            guiController.GUIDice();
            guiController.GUIController();
            guiController.show();
            guiController.showMessage1();
            guiController.GUIPlayer();


        }
    }
