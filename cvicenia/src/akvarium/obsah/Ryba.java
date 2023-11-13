package akvarium.obsah;

public class Ryba {
    protected int x;
    protected int y;

    protected SmerPlavania smer;

    public Ryba(int x, int y) {
        this.x = x;
        this.y = y;
        this.smer = SmerPlavania.DOPRAVA;
    }
    public String zobrazSa(){
        return "R";
    }
    public boolean nachadzaSa(int x, int y) {
        return this.x == x && this.y == y;
    }

    public void posun(int maxSirka, int maxVyska) {
        if (SmerPlavania.DOPRAVA == smer) {
            this.x++;
        }
        if (SmerPlavania.DOLAVA == smer) {
            this.x--;
        }
    }
}
