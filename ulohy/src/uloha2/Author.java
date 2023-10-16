package uloha2;

public class Author {
    private String meno;
    private String priezvisko;

    public Author(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }
}
