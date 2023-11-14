package uloha5;

import java.util.LinkedList;

public class Zoo {
    String nazov;
    LinkedList<Miesto> miesta = new LinkedList<>();

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
