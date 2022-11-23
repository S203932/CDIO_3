package SupportClasses;

import Fields.Property;

public class Player {
    private String name;
    private Account account;

    private Property[] property;

    private int position;
    private int jail;

    public Player() {
        setPlayerName("Player one");
        startAccount();
        setPosition(-1);
        instantiateProperty();
        setJail(0);
    }

    public void setJail(int jail){
        this.jail = jail;
    }

    public int getJail(){
        return jail;
    }

    public int getPosition() {
        return position;
    }

    public void diceRollPosition(int diceRoll){
        int oldPosition = this.position;
        int newPosition = oldPosition+diceRoll;
        if((newPosition)>=24){
            this.position = newPosition-24;
            this.account.additionKonto(2);
        }else{
            this.position = newPosition;
        }
    }

    public void setPosition(int position) {
        int oldPosition = this.position;
        if(position<oldPosition){
            this.account.additionKonto(2);
        }
    }

    public void setPlayerName(String navn) {
        this.name = navn;
    }

    public void startAccount() {
        this.account = new Account();
    }


    public Account getAccount() {
        return account;
    }

    public String getPlayerName() {
        return name;
    }

    public Property[] getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        int indexValue = 0;
        while (this.property[indexValue]!= null){
            indexValue++;
        }
        this.property[indexValue] = property;
    }

    public void instantiateProperty(){
        this.property = new Property[24];

    }
}

