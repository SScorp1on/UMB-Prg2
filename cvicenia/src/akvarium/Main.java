package akvarium;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Akvarium akvarium = new Akvarium(10, 10, 5);
        akvarium.zobraz();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(500);
            akvarium.posun();
            akvarium.zobraz();
        }

    }
}
