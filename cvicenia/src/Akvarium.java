import java.util.LinkedList;
import java.util.Random;

public class Akvarium {
    private final int sirka;
    private final int vyska;

    private final LinkedList<Ryba> ryby;


    public Akvarium(int sirka, int vyska, int pocetRyb) {
        this.sirka = sirka;
        this.vyska = vyska;
        ryby = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < pocetRyb; i++) {
            Ryba ryba = new Ryba(random.nextInt(sirka), random.nextInt(vyska));
            ryby.add(ryba);
        }
    }

    public void posun() {
        for (Ryba r : ryby) {
            if (r.getX() >= sirka - 1 || r.getX() <= 0) {
                r.osocSa();
            }
            r.posun();
        }
    }

    public void zobraz() {
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                boolean jeRyba = false;
                for (Ryba ryba : ryby) {
                    if (ryba.nachadzaSa(x, y)) {
                        jeRyba = true;
                    }
                }
                if (jeRyba)
                    System.out.print("R");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void pridajRybu(int x, int y) {
        Ryba ryba = new Ryba(x, y);
        ryby.add(ryba);
    }
}
