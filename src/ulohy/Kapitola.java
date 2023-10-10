package ulohy;

public class Kapitola {
    private String nazov;
    private String obsah;

    public Kapitola(String nazov, String obsah) {
        this.nazov = nazov;
        this.obsah = obsah;
    }

    public String getNazov() {
        return nazov;
    }

    public String getObsah() {
        return obsah;
    }

    public void zobraz() {
        System.out.println("Nazov kapitoly: " + nazov + ", " + "Obsah: " + obsah);
    }
}