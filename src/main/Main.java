package main;

import ulohy.Author;
import ulohy.Kapitola;
import ulohy.Kniha;
import ulohy.Kniznica;

public class Main {
    public static void main(String[] args) {
        //cvicenie
       /* Pole p = new Pole(10);
        p.napln();
        p.vypis();*/

        // Uloha 1
       /* Zlomok z1 = new Zlomok(5,3);
        Zlomok z2 = new Zlomok(4, 2);
        Zlomok z3 = z1.scitaj(z2);
        z3.vypis();*/

        //Uloha 2

        int pocetKnih = 10;
        Kniznica kniznica1 = new Kniznica(pocetKnih);
        kniznica1.setAdresa("Tajovskeho 40");
        kniznica1.setNazov("Kniznica 1");
        for (int i = 0; i < pocetKnih; i++) {
            Kniha kniha = new Kniha(5);
            Author author = new Author("German", "Belousov");
            kniha.setAuthor(author);
            Kapitola kapitola = new Kapitola("Kapitola " + i, "asdasdasdasdas" + i);
            kniha.setKapitolu(kapitola);
            kniha.setRokVydania(1990 + i);
            kniha.setNazov("Nazov " + i);
            kniznica1.setKnihu(kniha);
        }

        kniznica1.zobrazKnihy();
    }
}
