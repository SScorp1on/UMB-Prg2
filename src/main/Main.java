package main;

import ulohy.Zlomok;

public class Main {
    public static void main(String[] args) {
        // Uloha 1
        Zlomok z1 = new Zlomok(5,3);
        Zlomok z2 = new Zlomok(4, 2);
        Zlomok z3 = z1.scitaj(z2);
        z3.vypis();
    }
}
