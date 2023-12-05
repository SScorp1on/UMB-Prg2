package uloha5;

import uloha5.miesta.Bazen;
import uloha5.miesta.Klietka;
import uloha5.zvierata.Ryba;
import uloha5.zvierata.Zirafa;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Bratislava");
        Klietka klietka = new Klietka();
        klietka.umiestniZviera(new Zirafa(5));
        zoo.pridajMiesto(klietka);

        Bazen bazen = new Bazen();
        bazen.umiestniZviera(new Ryba(5));
        zoo.pridajMiesto(bazen);
        zoo.opis();

    }

}
