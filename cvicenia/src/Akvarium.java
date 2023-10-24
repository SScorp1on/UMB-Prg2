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

    public void zobraz() {
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                Ryba r = new Ryba(100, 100);
                for (Ryba ryba : ryby) {
                    if (ryba.getX() == x && ryba.getY() == y) {
                        r.setX(x);
                        r.setY(y);
                    }
                }
                if (y == r.getY() && x == r.getX())
                    System.out.print("R");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }

    public void pridajRybu(int x, int y) {
        Ryba ryba = new Ryba(x, y);
        ryby.add(ryba);
    }
}
