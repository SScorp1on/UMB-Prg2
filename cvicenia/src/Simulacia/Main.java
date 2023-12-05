package Simulacia;

public class Main {
    public static void main(String[] args) {
        Pocitac pocitac1 = new Pocitac();
        Pocitac pocitac2 = new Pocitac();
        SietoveRozhranie s1 = new SietoveRozhranie();
        pocitac1.pripoj(s1);
        SietoveRozhranie s2 = new SietoveRozhranie();
        pocitac2.pripoj(s2);
        Switch sw = new Switch(2);
        sw.pripoj(s1);
        sw.pripoj(s2);
        pocitac1.posli("Ahoj", pocitac2.getAdresa());
    }
}
