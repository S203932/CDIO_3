package Fields;

public class GoJail {
    private int position;
    private String name;
    private int moveTo;

    public GoJail() {
        setPosition(19);
        setName("Gå i fængsel");
        setMoveTo(7);
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

}
