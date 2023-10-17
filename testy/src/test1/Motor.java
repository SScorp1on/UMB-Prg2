package test1;

public class Motor {
    private String znacka;
    private int vykon;
    private Stav stav;

    public Motor(String znacka, int vykon) {
        this.znacka = znacka;
        this.vykon = vykon;
        this.stav = Stav.ZASTAVENY;
    }

    public void nastartuj() {
        this.stav = Stav.NASTARTOVANY;
    }

    public void zastav() {
        this.stav = Stav.ZASTAVENY;
    }

    public void zobraz() {
        System.out.println("Značka: " + znacka);
        System.out.println("Vykon: " + vykon);
        System.out.println("Stav: " + stav);
    }
}