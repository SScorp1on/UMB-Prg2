public class Akvarium {
    private int sirka;
    private int vyska;

    public Akvarium(int sirka, int vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public void generuj() {

    }

    public void zobraz() {
        for (int i = 0; i < vyska; i++) {
            for (int j = 0; j < sirka; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
