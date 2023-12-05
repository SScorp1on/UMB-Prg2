package Simulacia;

import java.util.UUID;

public class Pocitac implements SpracovatelPacketov, Zariadenie {

    private final int adresa;

    private SietoveRozhranie rozhranie;

    public Pocitac() {
        this.adresa = UUID.randomUUID().hashCode();
    }

    public void posli(String data, int adresa) {
        Packet p = new Packet(this.adresa, adresa, data);
        rozhranie.posli(p);
    }

    public void spracuj(Packet p) {
        System.out.println("Pocitac " + adresa + " prijal packet: " + p);
    }

    public void pripoj(SietoveRozhranie s) {
        rozhranie = s;
    }

    public int getAdresa() {
        return adresa;
    }

    public SietoveRozhranie getRozhranie() {
        return rozhranie;
    }
}
