package uloha5;

public class Zirafa extends Zviera implements Behajuce {
    private final int dlzkaKrku;

    public Zirafa(int dlzkaKrku) {
        this.dlzkaKrku = dlzkaKrku;
    }

    @Override
    public void bez() {
        System.out.println("Zirafa bezi");
    }

    @Override
    public String opis() {
        return "Zirafa s krkom dlhym " + dlzkaKrku + "m";
    }
}
