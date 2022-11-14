package org.example;
import SuportClasses.DiceCup;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class GUIController {
    GUI_Field[] fields = {
            new GUI_Start(),

            new GUI_Street(),
            new GUI_Street(),

            new GUI_Chance(),

            new GUI_Street(),
            new GUI_Street(),

            new GUI_Jail(),

            new GUI_Street(),
            new GUI_Street(),

            new GUI_Chance(),

            new GUI_Street(),
            new GUI_Street(),

            new GUI_Refuge(),

            new GUI_Street(),
            new GUI_Street(),

            new GUI_Chance(),

            new GUI_Street(),
            new GUI_Street(),

            new GUI_Jail(),

            new GUI_Street(),
            new GUI_Street(),

            new GUI_Chance(),

            new GUI_Street(),
            new GUI_Street(),
    };
    private GUI gui = new GUI(fields);

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

        gui.getFields()[1].setTitle("BURGERBAREN");
        gui.getFields()[1].setSubText("Pris: 1$");
        gui.getFields()[1].setBackGroundColor(new Color(245, 174, 68));

        gui.getFields()[2].setTitle("PIZZAHUSET");
        gui.getFields()[2].setSubText("Pris:  1$");
        gui.getFields()[2].setBackGroundColor(new Color(245, 174, 68));

        gui.getFields()[3].setTitle("PRØV LYKKEN");
        gui.getFields()[3].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[4].setTitle("SLIKBUTIK");
        gui.getFields()[4].setSubText("Pris:  1");
        gui.getFields()[4].setBackGroundColor(new Color(120, 244, 255));


        gui.getFields()[5].setTitle("ISBUTIK");
        gui.getFields()[5].setSubText("Pris:  1");
        gui.getFields()[5].setBackGroundColor(new Color(120, 244, 255));

        gui.getFields()[6].setSubText("FÆNGSEL BESØG");
        gui.getFields()[6].setBackGroundColor(new Color(125, 125, 125));

        gui.getFields()[7].setTitle("MUSEUM");
        gui.getFields()[7].setSubText("Pris:  2");
        gui.getFields()[7].setBackGroundColor(new Color(167, 0, 204));


        gui.getFields()[8].setTitle("BIBLIOTEKET");
        gui.getFields()[8].setSubText("Pris:  2");
        gui.getFields()[8].setBackGroundColor(new Color(167, 0, 204));

        gui.getFields()[9].setTitle("PRØV LYKKEN");
        gui.getFields()[9].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[10].setTitle("SKATERPARKEN");
        gui.getFields()[10].setSubText("Pris:  2");
        gui.getFields()[10].setBackGroundColor(new Color(142, 169, 41));


        gui.getFields()[11].setTitle("SVØMMEHALLEN");
        gui.getFields()[11].setSubText("Pris:  2");
        gui.getFields()[11].setBackGroundColor(new Color(142, 169, 41));

        gui.getFields()[12].setTitle("GRATIS PARKERING");
        gui.getFields()[12].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[13].setTitle("SPILLEHALLEN");
        gui.getFields()[13].setSubText("Pris:  3");
        gui.getFields()[13].setBackGroundColor(new Color(232, 9, 9));

        gui.getFields()[14].setTitle("BIOGRAFEN");
        gui.getFields()[14].setSubText("Pris:  3");
        gui.getFields()[14].setBackGroundColor(new Color(232, 9, 9));

        gui.getFields()[15].setTitle("PRØV LYKKEN");
        gui.getFields()[15].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[16].setTitle("LEGETØJSBUTIKKEN");
        gui.getFields()[16].setSubText("Pris:  3");
        gui.getFields()[16].setBackGroundColor(new Color(255, 255, 50));

        gui.getFields()[17].setTitle("DYREBUTIKKEN");
        gui.getFields()[17].setSubText("Pris:  3");
        gui.getFields()[17].setBackGroundColor(new Color(255, 255, 50));

        gui.getFields()[18].setTitle("GÅ I FÆNGSEL");
        gui.getFields()[18].setBackGroundColor(new Color(125, 125, 125));

        gui.getFields()[19].setTitle("BOWLINGHALLEN");
        gui.getFields()[19].setSubText("Pris:  4");
        gui.getFields()[19].setBackGroundColor(new Color(7, 89, 8));

        gui.getFields()[20].setTitle("ZOOLOGISK HAVE");
        gui.getFields()[20].setSubText("Pris:  4");
        gui.getFields()[20].setBackGroundColor(new Color(7, 89, 8));

        gui.getFields()[21].setTitle("PRØV LYKKEN");
        gui.getFields()[21].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[22].setTitle("VANDLANDET");
        gui.getFields()[22].setSubText("Pris:  5");
        gui.getFields()[22].setBackGroundColor(new Color(12, 33, 148));

        gui.getFields()[23].setTitle("STRANDPROMENADEN");
        gui.getFields()[23].setSubText("Pris:  5");
        gui.getFields()[23].setBackGroundColor(new Color(12, 33, 148));


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


    public int showMessage() {
        GUI gui = new GUI();
        gui.showMessage("Vælger antale af spiller ");
        int numberInput;
        String input;
        // Indlæser et tal mellem 2 og 4
        numberInput = gui.getUserInteger("Indtast et tal mellem 2 og 4", 2, 4);
        return showMessage();

    }
}
