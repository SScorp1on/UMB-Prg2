package Simulacia;

import java.util.Map;

public class Switch implements SpracovatelPacketov, Zariadenie {

    private Map<Integer, SietoveRozhranie> tabulka;

    public Switch(int pocetRozhrani) {
        tabulka = new java.util.HashMap<Integer, SietoveRozhranie>(pocetRozhrani);
    }

    @Override
    public void posli(String data, int adresa) {
        Packet p = new Packet(this.hashCode(), adresa, data);
        spracuj(p);
    }

    public void spracuj(Packet p) {
        if (tabulka.containsKey(p.getCielAdresa())) {
            tabulka.get(p.getCielAdresa()).posli(p);
        } else {
            System.out.println("Packet " + p + " zahodený");
        }
    }

    public void pripoj(SietoveRozhranie s) {
        tabulka.put(s.hashCode(), s);
    }
}
