package ChanceCardsAndDeck;

import Fields.Field;
import Fields.FieldList;
import Fields.Property;
import SupportClasses.Player;
import gui_main.GUI;
import org.example.GUIController;

import java.awt.*;


public class ChanceCards {
    private int type;
    private String description;
    private int moveTo;
    private int moveUpTo;
    private int transaction;

    private Color color;

    public ChanceCards(){
        initilalizeType();
        initilalizeDescription();
        initilalizeMoveTo();
        initilalizeMoveUpTo();
        initilalizeTransaction();
        setColor(Color.BLACK);
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public void initilalizeType(){
        this.type = -1;
    }

    public void initilalizeDescription(){
        this.description = "An empty description";
    }

    public void initilalizeMoveTo(){
        this.moveTo = -1;
    }

    public void initilalizeMoveUpTo(){
        this.moveUpTo = -1;
    }

    public void initilalizeTransaction(){
        this.transaction = 0;
    }

    public void setType(int type){
        this.type = type;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setMoveTo(int moveTo){
        this.moveTo = moveTo;
    }

    public void setMoveUpTo(int moveUpTo){
        this.moveUpTo = moveUpTo;
    }

    public void setTransaction(int transaction){
        this.transaction = transaction;
    }

    public int getType(){
        return this.type;
    }

    public String getDescription(){
        return this.description;
    }

    public int getMoveTo(){
        return this.moveTo;
    }

    public int getMoveUpTo(){
        return this.moveUpTo;
    }

    public int getTransaction(){
        return this.transaction;
    }

    public void cardAction(Player player, ChanceCards card, GUI gui, Field[] fieldList ){
        switch (card.getType()){
            case 2:
                player.setPosition(card.getMoveTo());
                break;

            case 1:
                String chosenButton = gui.getUserButtonPressed(
                        "Choose what field you want to move to:",
                        "Burger Place", "Pizza");
                if(chosenButton.equalsIgnoreCase("Burger Place")){
                    player.setPosition(1);
                    Boolean available=((Property)fieldList[1]).getAvailability();
                    if(available){
                        ((Property)fieldList[1]).buyProperty(player);
                    }else{

                    }
                }
                // position.setPosition(card.getMoveTo());
                break;

            case 3:
                //transaction.transactionAccount(card.getTransaction()); I'll fix this later, can't
                //remember what it is supposed to do
                break;
            default: break;
        }
    }

    public String toString(){
        return "This card has the following type: "+this.type+"\nThe following description: "+this.description+
                "\nThe following MoveTo: "+this.moveTo+"\nThe following MoveUpTo: "+this.moveUpTo+"\n And the " +
                "the following transaction: "+this.transaction;
    }




}
