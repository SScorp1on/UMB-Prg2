package uloha2;

import java.util.ArrayList;

public class Kniznica {
    private String nazov;
    private String adresa;
    private ArrayList<Kniha> knihy;

    public Kniznica(int pocetKnih) {
        knihy = new ArrayList<>(pocetKnih);
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNazov() {
        return nazov;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setKnihu(Kniha kniha) {
                knihy.add(kniha);
    }

    public void zobrazKnihy() {
        for (Kniha kniha : knihy) {
            kniha.zobraz();
            kniha.pocetPismen();
            System.out.println("--------------------");
        }
    }
}
