package org.example;

public class Field {
    private int position;
    private String name;

    public Field(){
        setName("Noname");
        setPosition(-1);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String setName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public String toString(){
        return "This field is a : " + this.getClass().getSimpleName();
    }
}
