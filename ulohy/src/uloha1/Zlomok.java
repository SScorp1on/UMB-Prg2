package uloha1;

public class Zlomok {
    int citatel;
    int menovatel;

    public Zlomok(int citatel, int menovatel) {
        this.citatel = citatel;
        this.menovatel = menovatel;
    }

    public Zlomok scitaj(Zlomok zlomok) {
        int novyCitatel = this.citatel * zlomok.menovatel + zlomok.citatel;
        int novyMenovatel = this.menovatel * zlomok.menovatel;
        return new Zlomok(novyCitatel, novyMenovatel);
    }

    public void vypis() {
        System.out.println(citatel);
        System.out.println("--");
        System.out.println(menovatel);
    }
}