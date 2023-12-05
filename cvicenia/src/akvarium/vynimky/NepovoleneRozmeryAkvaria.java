package akvarium.vynimky;

public class NepovoleneRozmeryAkvaria extends Exception {
    private final String minimalnyRozmer;

    public NepovoleneRozmeryAkvaria(String minimalnyRozmer) {
        this.minimalnyRozmer = minimalnyRozmer;
    }

    public String getMinimalnyRozmer() {
        return minimalnyRozmer;
    }
}
