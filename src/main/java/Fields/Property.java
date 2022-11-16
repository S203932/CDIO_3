package Fields;
import SupportClasses.Player;

import java.awt.*;


public class Property extends Field {
    //

    private int value;
    private boolean availability;
    private int type;
    private Color color;

    public Property() {
        setValue(0);
        setAvailability(false);
        setType(-1);
        setColor(Color.black);

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

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor(){
        return this.color;
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

    public void buyProperty(Player player, Property property){
        property.setAvailability(false);
        player.getAccount().subtractionAccount(property.getValue());
    }
}