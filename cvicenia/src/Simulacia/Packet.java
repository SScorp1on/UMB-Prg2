package Simulacia;

import java.util.ArrayList;
import java.util.List;

public class Packet {
    private int zdrojAdresa;
    private int cielAdresa;
    private String data;
    private List<Zariadenie> cesta = new ArrayList<Zariadenie>();

    public Packet(int zdrojAdresa, int cielAdresa, String data) {
        this.zdrojAdresa = zdrojAdresa;
        this.cielAdresa = cielAdresa;
        this.data = data;
    }

    public void dalsieZariadenie(Zariadenie z) {
        cesta.add(z);
    }

    public Zariadenie getOdosielatel() {
        return cesta.get(cesta.size() - 1);
    }

    public int getZdrojAdresa() {
        return zdrojAdresa;
    }

    public int getCielAdresa() {
        return cielAdresa;
    }
}
