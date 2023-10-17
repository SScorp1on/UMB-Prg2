package test1;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("BMW", 2);
        motor.nastartuj();
        motor.zobraz();
        motor.zastav();
        motor.zobraz();
    }
}