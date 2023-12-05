package Simulacia;

public class SietoveRozhranie {
    private SpracovatelPacketov zariadenie;
    private SietoveRozhranie pripojenie;

    public SietoveRozhranie() {
        //TODO
    }

    public void prepoj(SietoveRozhranie s) {
        pripojenie = s;
    }

    public void posli(Packet p) {
        pripojenie.prijmi(p);
    }

    public void prijmi(Packet p) {
        zariadenie.spracuj(p);
    }
}
