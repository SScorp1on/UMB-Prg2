package akvarium;

import akvarium.obsah.Gupka;
import akvarium.obsah.Ryba;
import akvarium.obsah.Skalar;
import akvarium.vynimky.NepovoleneRozmeryAkvaria;
import akvarium.vynimky.NepovolenyPocetRyb;

import java.util.LinkedList;
import java.util.Random;

public class Akvarium {
    private final int sirka;
    private final int vyska;

    private final LinkedList<Ryba> ryby = new LinkedList<>();


    public Akvarium(int sirka, int vyska, int pocetRyb) throws NepovoleneRozmeryAkvaria, NepovolenyPocetRyb {
        if (sirka < 3 || vyska < 3)
            throw new NepovoleneRozmeryAkvaria("3x3");
        if (pocetRyb > sirka * vyska)
            throw new NepovolenyPocetRyb("V akvariu sa nemoze nachadzat viac ryb ako je miesta");
        this.sirka = sirka;
        this.vyska = vyska;
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
                Ryba najdenaRyba = null;
                for (Ryba ryba : ryby) {
                    if (ryba.nachadzaSa(x, y)) {
                        najdenaRyba = ryba;
                        break;
                    }
                }
                if (najdenaRyba != null)
                    System.out.println(najdenaRyba.zobrazSa());
                else
                    System.out.print(".");
            }
            System.out.println();
        }
        System.out.println();
    }
}
