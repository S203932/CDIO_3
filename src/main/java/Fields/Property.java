package Fields;

public class Property extends Field {

// Constructor der opstiller en property       

    private int value;
    private boolean availability;
    private int type;

    public Property(){
        setValue(0);
        setAvailability(false);
        setType(-1);

    }
    public void setValue(int value){
        this.value = value;
    }
    public void setAvailability(boolean availability){
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
    public int getType(){
        return this.type;
    }

    

}