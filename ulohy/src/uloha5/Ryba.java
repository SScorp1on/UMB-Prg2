package uloha5;

public class Ryba extends Zviera implements Plavajuce {
    private final int vydrz;

    public Ryba(int vydrz) {
        this.vydrz = vydrz;
    }

    @Override
    public void plavaj() {
        System.out.println("Ryba plava");
    }

    @Override
    public String opis() {
        return "Ryba s vydrzou " + vydrz + "h";
    }
}
