public class Main {
    public static void main(String[] args) throws InterruptedException {
        Akvarium a = new Akvarium(7, 4, 5);
        for (int i = 0; i < 100; i++) {
            a.zobraz();
            a.posun();
            Thread.sleep(300);
        }
    }
}
