package Fields;
import SupportClasses.Player;

import java.awt.*;


public class Property extends Field {
    //

    private int value;
    private boolean availability;
    private int type;

    private Player player;

    public Property() {
        setValue(0);
        setAvailability(false);
        setType(-1);
        setColor(Color.black);
        setPlayer(setName();
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getAvailability() {
        return this.availability;
    }

    public int getType() {
        return this.type;
    }

    public void buyProperty(Player player){
        this.availability = false;
        player.getAccount().subtractionAccount(this.value);
    }
    public void PayRentProperty(Player player, Property property){
            player.getAccount().subtractionAccount(this.value);
            player.setAccount().additionAccount(this.value);
    }
}