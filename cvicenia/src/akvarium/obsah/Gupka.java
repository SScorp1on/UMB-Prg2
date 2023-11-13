package akvarium.obsah;

public class Gupka extends Ryba{
    public Gupka(int x, int y) {
        super(x, y);
    }
    @Override
    public String zobrazSa() {
        return "G";
    }

    @Override
    public void posun(int maxSirka, int maxVyska) {
        if (maxSirka - 1 == this.x) {
            smer = SmerPlavania.DOLAVA;
        }
        if (this.x == 0){
            smer = SmerPlavania.DOPRAVA;
        }
        if (SmerPlavania.DOPRAVA == smer) {
            this.x++;
        }
        if (SmerPlavania.DOLAVA == smer) {
            this.x--;
        }
    }
}
