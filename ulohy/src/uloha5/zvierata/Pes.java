package uloha5.zvierata;

import uloha5.shopnosti.Behajuce;
import uloha5.shopnosti.Plavajuce;

public class Pes extends Zviera implements Behajuce, Plavajuce {
    private final float poslusnost;

    public Pes(float poslusnost) {
        this.poslusnost = poslusnost;
    }

    @Override
    public void plavaj() {
        System.out.println("Pes plava");
    }

    @Override
    public void bez() {
        System.out.println("Pes bezi");
    }

    @Override
    public String opis() {
        return "Pes s poslusnostou " + poslusnost + "%";
    }
}
