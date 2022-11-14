package SuportClasses;

public class FeltListe {
    private int[] feltListe;


    public FeltListe() {
        initializeFeltListe();
    }


    public void initializeFeltListe() {
        this.feltListe = new int[] {250,-100,100,-20,180,0,-70,60,-80,-50,650};
    }

    public void setFeltListeIndex(int index, int værdi) {
        if(index>12||index<2) {
            System.out.println("index er uden for feltListe");
        }else {
            this.feltListe[index-2] = værdi;

        }
    }

    public int getFeltListeIndex(int index) {
        if(index>12||index<2) {
            System.out.println("index er uden for feltListe");
            return 0;
        }else {
            return feltListe[index-2];
        }
    }

    public String toString() {
        String string = "Værdier i feltListe: "+feltListe[0];

        for(int i=1; i<11; i++) {
            string = string+", "+feltListe[i];
        }

        return string;

    }

}