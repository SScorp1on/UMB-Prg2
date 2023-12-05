package uloha5;

import uloha5.miesta.Miesto;

import java.util.LinkedList;
import java.util.List;

public class Zoo {
    String nazov;
    List<Miesto> miesta = new LinkedList<>();

    public Zoo(String nazov) {
        this.nazov = nazov;
    }

    public void pridajMiesto(Miesto m) {
        miesta.add(m);
    }

    public void opis() {
        System.out.println("Zoo " + nazov + " obsahuje:");
        for (Miesto m : miesta) {
            System.out.println(m.opis());
        }
    }
}
