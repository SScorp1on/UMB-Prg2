package uloha5;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo1");
        Miesto k1 = new Klietka();
        Miesto b1 = new Bazen();
        Zviera z1 = new Zirafa(5);
        
        zoo.pridajMiesto(k1);
        zoo.pridajMiesto(b1);

    }

}
