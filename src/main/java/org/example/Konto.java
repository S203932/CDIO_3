package org.example;
public class Konto {
    private int pengebeholdning;

    public Konto() {
        initializeKonto();

    }

    public Boolean initializeKonto() {
        this.pengebeholdning = 1000;
        return true;
    }

    public Boolean setKonto(int pengebeholdning) {
        this.pengebeholdning = pengebeholdning;
        return true;
    }


    public Boolean subtractionKonto(int subtractValue) {
        this.pengebeholdning = pengebeholdning - subtractValue;
        if(this.pengebeholdning<0) {
            this.pengebeholdning = 0;
        }
        return true;
    }


    public Boolean additionKonto(int additionValue) {
        this.pengebeholdning = pengebeholdning + additionValue;
        if(this.pengebeholdning<0) {
            this.pengebeholdning = 0;
        }
        return true;
    }

    public int getPengebeholdning() {
        return pengebeholdning;
    }

    public String toString() {
        String value = "pengeBeholdning: "+pengebeholdning;
        return value;
    }

}