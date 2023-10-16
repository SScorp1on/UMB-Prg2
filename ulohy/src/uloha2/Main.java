package uloha2;

public class Main {
    public static void main(String[] args) {
        int pocetKnih = 5;
        Kniznica kniznica1 = new Kniznica(pocetKnih);
        kniznica1.setAdresa("Tajovskeho 40");
        kniznica1.setNazov("Kniznica 1");
        for (int i = 0; i < pocetKnih; i++) {
            Kniha kniha = new Kniha(3);
            Author author = new Author("German", "Belousov");
            kniha.setAuthor(author);
            Kapitola kapitola = new Kapitola("Kapitola " + i, "asdasdas" + i);
            kniha.setKapitolu(kapitola);
            kniha.setKapitolu(kapitola);
            kniha.setKapitolu(kapitola);
            kniha.setRokVydania(1990 + i);
            kniha.setNazov("Nazov " + i);
            kniznica1.setKnihu(kniha);
        }
        kniznica1.zobrazKnihy();
    }
}
