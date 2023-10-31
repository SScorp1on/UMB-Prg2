public class Ryba {
    private int x;
    private int y;

    private SmerPlavania smer;

    public Ryba(int x, int y) {
        this.x = x;
        this.y = y;
        this.smer = SmerPlavania.DOPRAVA;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSmer(SmerPlavania smer) {
        this.smer = smer;
    }

    public SmerPlavania getSmer() {
        return smer;
    }

    public boolean nachadzaSa(int x, int y) {
        return this.x == x && this.y == y;
    }

    public void incrementX() {
        this.x = this.x + 1;
    }

    public void decrementX() {
        this.x = this.x - 1;
    }

    public void posun() {
        if (smer == SmerPlavania.DOPRAVA)
            incrementX();
        if (smer == SmerPlavania.DOLAVA)
            decrementX();
    }

    public void osocSa() {
        if (smer == SmerPlavania.DOPRAVA)
            smer = SmerPlavania.DOLAVA;
        else
            smer = SmerPlavania.DOPRAVA;
    }

    public int getY() {
        return y;
    }
}
