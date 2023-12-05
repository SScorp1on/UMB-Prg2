package akvarium;

public class Main {
    public static void main(String[] args) {
        try {
            Akvarium akvarium = new Akvarium(3, 3, 10);
            for (int i = 0; i < 20; i++) {
                Thread.sleep(500);
                akvarium.posun();
                akvarium.zobraz();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
