package akvarium.obsah;

public class Skalar extends Ryba {
    public Skalar(int x, int y) {
        super(x, y);
    }
    @Override
    public String zobrazSa() {
        return "S";
    }
    @Override
    public void posun(int maxSirka, int maxVyska) {
        if (maxVyska - 1 == this.y) {
            smer = SmerPlavania.DOLAVA;
        }
        if (this.y == 0){
            smer = SmerPlavania.DOPRAVA;
        }
        if (SmerPlavania.DOLAVA == smer) {
            this.y--;
        }
        if (SmerPlavania.DOPRAVA == smer) {
            this.y++;
        }
    }
}
