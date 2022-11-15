package org.example;

public class Field {

    @Override
    public String toString(){
        return "This field is a : " + this.getClass().getSimpleName();
    }
}
