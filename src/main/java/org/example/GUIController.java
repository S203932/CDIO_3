package org.example;
import CreateAndWriteToAndFromTXT.ReadFile;
import SupportClasses.DiceCup;
import SupportClasses.Player;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;
import java.util.ArrayList;

public class GUIController {
    GUI_Field[] fields = {
            new GUI_Start(), new GUI_Street(), new GUI_Street(), new GUI_Chance(), new GUI_Street(), new GUI_Street(),

            new GUI_Jail(), new GUI_Street(), new GUI_Street(), new GUI_Chance(), new GUI_Street(), new GUI_Street(),

            new GUI_Refuge(), new GUI_Street(), new GUI_Street(), new GUI_Chance(), new GUI_Street(), new GUI_Street(),

            new GUI_Jail(), new GUI_Street(), new GUI_Street(), new GUI_Chance(), new GUI_Street(), new GUI_Street(),
    };
    private GUI gui = new GUI(fields);
    private     DiceCup dice = new DiceCup(1);
    private GUI_Car car=new GUI_Car();

  /*  public void GUIPlayer(){
        GUI_Field field = gui.getFields()[dice.result()];
        GUI_player[0].getCar().setPosition(field);
        GUI_playerTwo.getCar().setPosition(field);
        GUI_playerThree.getCar().setPosition(field);
        GUI_playerFour.getCar().setPosition(field);
    }*/
    public Player[] initialzePlayers() {
        int amountPlayers = gui.getUserInteger("Indtast antal spiller", 2, 4);
        Player[] player =new Player[amountPlayers];
        GUI_Player[] GUI_player=new GUI_Player[amountPlayers];
        if (amountPlayers==2){
            for (int i = 0; i < player.length; i++ ){
                player[i]=new Player();
                player[i].setPlayerName(gui.getUserString("Indtast navn"));
                player[i].getAccount().setAccount(20);
                GUI_player[i]=new GUI_Player(player[i].getPlayerName(),20);
                gui.addPlayer(GUI_player[i]);
            }
        } else if(amountPlayers==3){
            for (int i = 0; i < player.length; i++ ){
                player[i]=new Player();
                player[i].setPlayerName(gui.getUserString("Indtast navn"));
                player[i].getAccount().setAccount(18);
                GUI_player[i]=new GUI_Player(player[i].getPlayerName(),18);
                gui.addPlayer(GUI_player[i]);
            }
        } else if(amountPlayers==4){
            for (int i = 0; i < player.length; i++ ){
                player[i]=new Player();
                player[i].setPlayerName(gui.getUserString("Indtast navn"));
                player[i].getAccount().setAccount(16);
                GUI_player[i]=new GUI_Player(player[i].getPlayerName(),16);
                gui.addPlayer(GUI_player[i]);
            }
        }
        return player;
    }

    public void GUIController(String filename) {
        ReadFile readFile = new ReadFile();
        ArrayList<String> stringArrayList = readFile.ReadFile(filename);
        gui.getFields()[0].setTitle(stringArrayList.get(1));
        gui.getFields()[0].setSubText("Modtager 2$, når du passerer");
        gui.getFields()[0].setBackGroundColor(new Color(255, 255, 255));

        gui.getFields()[1].setTitle(stringArrayList.get(2));
        gui.getFields()[1].setSubText("Pris: 1$");
        gui.getFields()[1].setBackGroundColor(new Color(245, 174, 68));

        gui.getFields()[2].setTitle(stringArrayList.get(3));
        gui.getFields()[2].setSubText("Pris:  1$");
        gui.getFields()[2].setBackGroundColor(new Color(245, 174, 68));

        gui.getFields()[3].setTitle(stringArrayList.get(4));
        gui.getFields()[3].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[4].setTitle(stringArrayList.get(5));
        gui.getFields()[4].setSubText("Pris:  1");
        gui.getFields()[4].setBackGroundColor(new Color(120, 244, 255));


        gui.getFields()[5].setTitle(stringArrayList.get(6));
        gui.getFields()[5].setSubText("Pris:  1");
        gui.getFields()[5].setBackGroundColor(new Color(120, 244, 255));

        gui.getFields()[6].setSubText(stringArrayList.get(7));
        gui.getFields()[6].setBackGroundColor(new Color(125, 125, 125));

        gui.getFields()[7].setTitle(stringArrayList.get(8));
        gui.getFields()[7].setSubText("Pris:  2");
        gui.getFields()[7].setBackGroundColor(new Color(167, 0, 204));


        gui.getFields()[8].setTitle(stringArrayList.get(9));
        gui.getFields()[8].setSubText("Pris:  2");
        gui.getFields()[8].setBackGroundColor(new Color(167, 0, 204));

        gui.getFields()[9].setTitle(stringArrayList.get(10));
        gui.getFields()[9].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[10].setTitle(stringArrayList.get(11));
        gui.getFields()[10].setSubText("Pris:  2");
        gui.getFields()[10].setBackGroundColor(new Color(142, 169, 41));


        gui.getFields()[11].setTitle(stringArrayList.get(12));
        gui.getFields()[11].setSubText("Pris:  2");
        gui.getFields()[11].setBackGroundColor(new Color(142, 169, 41));

        gui.getFields()[12].setTitle(stringArrayList.get(13));
        gui.getFields()[12].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[13].setTitle(stringArrayList.get(14));
        gui.getFields()[13].setSubText("Pris:  3");
        gui.getFields()[13].setBackGroundColor(new Color(232, 9, 9));

        gui.getFields()[14].setTitle(stringArrayList.get(15));
        gui.getFields()[14].setSubText("Pris:  3");
        gui.getFields()[14].setBackGroundColor(new Color(232, 9, 9));

        gui.getFields()[15].setTitle(stringArrayList.get(16));
        gui.getFields()[15].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[16].setTitle(stringArrayList.get(17));
        gui.getFields()[16].setSubText("Pris:  3");
        gui.getFields()[16].setBackGroundColor(new Color(255, 255, 50));

        gui.getFields()[17].setTitle(stringArrayList.get(18));
        gui.getFields()[17].setSubText("Pris:  3");
        gui.getFields()[17].setBackGroundColor(new Color(255, 255, 50));

        gui.getFields()[18].setTitle(stringArrayList.get(19));
        gui.getFields()[18].setBackGroundColor(new Color(125, 125, 125));

        gui.getFields()[19].setTitle(stringArrayList.get(20));
        gui.getFields()[19].setSubText("Pris:  4");
        gui.getFields()[19].setBackGroundColor(new Color(7, 89, 8));

        gui.getFields()[20].setTitle(stringArrayList.get(21));
        gui.getFields()[20].setSubText("Pris:  4");
        gui.getFields()[20].setBackGroundColor(new Color(7, 89, 8));

        gui.getFields()[21].setTitle(stringArrayList.get(22));
        gui.getFields()[21].setBackGroundColor(new Color(204, 204, 204));

        gui.getFields()[22].setTitle(stringArrayList.get(23));
        gui.getFields()[22].setSubText("Pris:  5");
        gui.getFields()[22].setBackGroundColor(new Color(12, 33, 148));

        gui.getFields()[23].setTitle(stringArrayList.get(24));
        gui.getFields()[23].setSubText("Pris:  5");
        gui.getFields()[23].setBackGroundColor(new Color(12, 33, 148));


    }

   public void GUIDice(){
        dice.rollDice();
        gui.setDie(dice.result());
   }

    public int show() {
        gui.showMessage("Vælger antale af spiller ");
        int numberInput;
        //Indlæser et tal mellem 2 og 4
        numberInput = gui.getUserInteger("Indtast et tal mellem 2 og 4", 2, 4);
        return numberInput;
    }

    public GUI getGui(){
     return this.gui;
    }

     }

