package SupportClasses;

public class FeltListe {
    private int[] feltListe;


    public FeltListe() {
        initializeFeltListe();
    }


    public void initializeFeltListe() {
        this.feltListe = new int[] {2,1,1,0,1,1,0,2,2,0,2,2,0,3,3,0,3,3,0,4,4,0,5,5};
    }

    public void setFeltListeIndex(int index, int værdi) {
        if(index>24||index<1) {
            System.out.println("index er uden for feltListe");
        }else {
            this.feltListe[index-2] = værdi;

        }
    }

    public int getFeltListeIndex(int index) {
        if(index>24||index<1) {
            System.out.println("index er uden for feltListe");
            return 0;
        }else {
            return feltListe[index-2];
        }
    }

    public String toString() {
        String string = "Værdier i feltListe: "+feltListe[0];

        for(int i=0; i<23; i++) {
            string = string+", "+feltListe[i];
        }

        return string;

    }

}