package akvarium;

import akvarium.obsah.Gupka;
import akvarium.obsah.Ryba;
import akvarium.obsah.Skalar;

import java.util.LinkedList;
import java.util.Random;

public class Akvarium {
    private final int sirka;
    private final int vyska;

    private final LinkedList<Ryba> ryby;


    public Akvarium(int sirka, int vyska, int pocetRyb) {
        this.sirka = sirka;
        this.vyska = vyska;
        ryby = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < pocetRyb; i++) {
            int typ = random.nextInt(2);
            if (typ == 0) {
                ryby.add(new Skalar(random.nextInt(sirka), random.nextInt(vyska)));
            } else {
                ryby.add(new Gupka(random.nextInt(sirka), random.nextInt(vyska)));
            }
        }
    }

    public void posun() {
        for (Ryba r : ryby) {
            r.posun(sirka, vyska);
        }
    }

    public void zobraz() {
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                boolean jeRyba = false;
                for (Ryba ryba : ryby) {
                    if (ryba.nachadzaSa(x, y)) {
                        jeRyba = true;
                    }
                }
                if (jeRyba)
                    for (Ryba ryba : ryby) {
                        if (ryba.nachadzaSa(x, y)) {
                            System.out.print(ryba.zobrazSa());
                        }
                    }
                else
                    System.out.print(".");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*public void pridajRybu(int x, int y) {
        Ryba ryba = new Ryba(x, y);
        ryby.add(ryba);
    }*/
}
