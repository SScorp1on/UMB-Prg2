package akvarium.vynimky;

public class NepovolenyPocetRyb extends Exception {
    private final String minimalnyPocetRyb;

    public NepovolenyPocetRyb(String minimalnyPocetRyb) {
        this.minimalnyPocetRyb = minimalnyPocetRyb;
    }

    public String getMinimalnyPocetRyb() {
        return minimalnyPocetRyb;
    }
}
