package org.example;

import SuportClasses.DiceCup;
import gui_main.GUI;

public class GUIController {
    public void GUIController (){
        GUI gui = new GUI();
        DiceCup dice = new DiceCup(1);
        dice.rollDice();
        gui.setDie(dice.result());
      //  dice.showDice(gui);
    }

}
