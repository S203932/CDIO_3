package Fields;

import SupportClasses.Player;

public class GoJail extends Field{
    private int position;
    private String name;
    private int moveTo;

    public GoJail() {
        setPosition(18);
        setName("Gå i fængsel");
        setMoveTo(6);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoveTo() {
        return moveTo;
    }

    public void setMoveTo(int moveTo) {
        this.moveTo = moveTo;
    }

    public void GoToJail(Player player){
        player.setPosition(6);
        player.getAccount().subtractionAccount(2);
    }
}
