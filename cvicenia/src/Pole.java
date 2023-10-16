import java.util.Arrays;
import java.util.Random;

public class Pole {
    int[] pole;

    public void pracuj() {
        napln();
        vypis();
        zotried();
        vypis();
    }

    public Pole(int velkost) {
        pole = new int[velkost];
    }

    public void napln() {
        Random r = new Random();
        for (int i = 0; i < pole.length; i++) {
            pole[i] = r.nextInt(pole.length);
        }
    }

    public void zotried() {
        Arrays.sort(pole);
    }

    public void vypis() {
        for (int j : pole) {
            System.out.println(j);
        }
        System.out.println();
    }

    public boolean porovnaj(Pole p) {
        if (this.pole.length != p.pole.length)
            return false;
        boolean res = true;
        for (int i = 0; i < this.pole.length; i++) {
            if (this.pole[i] != p.pole[i]) {
                res = false;
                break;
            }
        }
        return res;
    }

    public void kopia(Pole p) {
        if (pole == null) {
            pole = new int[p.pole.length];
        }
        System.arraycopy(p.pole, 0, pole, 0, p.pole.length);
    }
}
