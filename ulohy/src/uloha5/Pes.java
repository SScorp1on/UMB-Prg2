package uloha5;

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
