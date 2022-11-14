package org.example;
import SuportClasses.DiceCup;
import gui_main.GUI;

import java.awt.*;

public class GUIController {
private GUI gui = new GUI();
 /*   public void GUIFelt(String title, String SubTitle, int index, Color color ) {
        gui.getFields()[index].setTitle(title);
        gui.getFields()[index].setSubText(SubTitle);
        gui.getFields()[index].setBackGroundColor(Color);
    }
    GUIFelt ("START", "Modtager 2$, når du passerer", 0, new Color(255, 255, 255)){     }
*/
    public void GUIController() {
        gui.getFields()[0].setTitle("START");
        gui.getFields()[0].setSubText("Modtager 2$, når du passerer");
        gui.getFields()[0].setBackGroundColor(new Color(255, 255, 255));

        gui.getFields()[1].setTitle("Burgerbaren");
        gui.getFields()[1].setSubText("Pris: 1$");
        gui.getFields()[1].setBackGroundColor(new Color(245, 174, 68));

        gui.getFields()[2].setTitle("Pizzahuset");
        gui.getFields()[2].setSubText("Pris:  1$");
        gui.getFields()[2].setBackGroundColor(new Color(245, 174, 68));

        gui.getFields()[3].setTitle("Prøv lykken");
        gui.getFields()[3].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[4].setTitle("Slikbutik");
        gui.getFields()[4].setSubText("Pris:  1");
        gui.getFields()[4].setBackGroundColor(new Color(120, 244, 255));


        gui.getFields()[5].setTitle("Isbutik");
        gui.getFields()[5].setSubText("Pris:  1");
        gui.getFields()[5].setBackGroundColor(new Color(120, 244, 255));

        gui.getFields()[6].setSubText("Fængsel");
        gui.getFields()[6].setBackGroundColor(new Color(125, 125, 125));

        gui.getFields()[7].setTitle("Museum");
        gui.getFields()[7].setSubText("Pris:  2");
        gui.getFields()[7].setBackGroundColor(new Color(167, 0, 204));


        gui.getFields()[8].setTitle("Biblioteket");
        gui.getFields()[8].setSubText("Pris:  2");
        gui.getFields()[8].setBackGroundColor(new Color(167, 0, 204));

        gui.getFields()[9].setTitle("Prøv lykken");
        gui.getFields()[9].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[10].setTitle("Skateparken");
        gui.getFields()[10].setSubText("Pris:  2");
        gui.getFields()[10].setBackGroundColor(new Color(142, 169, 41));


        gui.getFields()[11].setTitle("Svømmehallen");
        gui.getFields()[11].setSubText("Pris:  2");
        gui.getFields()[11].setBackGroundColor(new Color(142, 169, 41));
    }
    /*

        fields[i++] = new GUI_Refuge("default", "Helle", "Helle", "Ta' en pause", Color.WHITE, Color.BLACK);

        fields[i++] = new GUI_Street("Spillehallen", "Pris:  3", "Spillehallen", "Leje:  3", new Color(232, 9, 9), Color.BLACK);
        fields[i++] = new GUI_Street("Biografen", "Pris:  3", "Biografen", "Leje:  3", new Color(232, 9, 9), Color.BLACK);

        fields[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);

        fields[i++] = new GUI_Street("Legetøjsbutikken", "Pris:  3", "Legetøjsbutikken", "Leje:  3", new Color(255, 255, 50), Color.BLACK);
        fields[i++] = new GUI_Street("Dyrhandlen", "Pris:  3", "Dyrhandlen", "Leje:  3", new Color(255, 255, 50), Color.BLACK);

        fields[i++] = new GUI_Jail("default", "Gå i fængsel", "Gå i fængsel", "De fængsles\nSlå to ens for at komme ud", new Color(125, 125, 125), Color.BLACK);

        fields[i++] = new GUI_Street("Bowling", "Pris:  4", "Bowling", "Leje:  4", new Color(7, 89, 8), Color.BLACK);
        fields[i++] = new GUI_Street("Zoologisk have", "Pris:  4", "Zoologisk have", "Leje:  4", new Color(7, 89, 8), Color.BLACK);

        fields[i++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);

        fields[i++] = new GUI_Street("Vandlandet", "Pris:  5", "Vandlandet", "Leje:  5", new Color(12, 33, 147), Color.WHITE);
        fields[i++] = new GUI_Street("Strandpromenaden", "Pris:  5", "Strandpromenaden", "Leje:  5", new Color(12, 33, 147), Color.WHITE);

    }*/

   public void GUIDice(){

        DiceCup dice = new DiceCup(1);
        dice.rollDice();
        gui.setDie(dice.result());
   }



}
