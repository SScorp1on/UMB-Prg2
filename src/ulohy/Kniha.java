package ulohy;

import java.util.ArrayList;


public class Kniha {
    private String nazov;
    private Author author;
    private int rokVydania;
    private ArrayList<Kapitola> kapitoly;

    public Kniha(int pocetKapitol) {
        kapitoly = new ArrayList<>(pocetKapitol);
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }


    public void zobraz() {
        System.out.printf("Nazov knihy: %s\n", nazov);
        System.out.printf("Author: %s %s\n", author.getMeno(), author.getPriezvisko());
        System.out.printf("rokVydania: %d\n", rokVydania);
        for (Kapitola kapitola : kapitoly) {
            kapitola.zobraz();
        }
    }

    public void pocetPismen() {
        int pocet = 0;
        for (Kapitola kapitola : kapitoly) {
            String n = kapitola.getNazov();
            String o = kapitola.getObsah();
            pocet += n.length();
            pocet += o.length();
        }
        System.out.println("Pocet pismen: " + pocet);
    }

    public void setKapitolu(Kapitola k) {
        kapitoly.add(k);
    }
}
