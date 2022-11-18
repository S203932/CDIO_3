package SupportClasses;

import Fields.Property;

public class Player {
    private String name;
    private Account account;

    private Property[] property;

    private int position;

    public Player() {
        setPlayerName("Player one");
        startAccount();
        setPosition(-1);
        setProperty();
    }

    public int getPosition() {
        return position;
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

    public void setProperty(Property[] property) {
        this.property = property;
    }







}
