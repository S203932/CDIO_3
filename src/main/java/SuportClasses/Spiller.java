package SuportClasses;

public class Spiller {
    private String name;
    private Konto konto;


    public Spiller() {
        setSpillerName("Player one");
        startKonto();
    }


    public void setSpillerName(String navn) {
        this.name = navn;
    }

    public void startKonto() {
        this.konto = new Konto();
    }

    public Konto getKonto() {
        return konto;
    }

    public String getSpillerName() {
        return name;
    }
}
