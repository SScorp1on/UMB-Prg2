# Uloha: Kniha

Namodelujte knihu,
ktorá je opísaná názvom, autorom, rokom vydania a kapitolami.
Počet kapitol sa určí parametrom konštruktora pri vytváraní inštancie knihy.
Každá kapitola má názov a obsah (rozumej text).
Knihu je možné zobraziť (zobrazia sa všetky kapitoly).
Kniha ďalej bude mať funkciu (metódu) na spočítanie všetkých písmen (znakov) v celej knihe.

Časť 2: Rozšírte príklad o koncept Knižnice (Knižnica má tiež svoj názov, adresu, a pole kníh, ktoré sa v nej
nachádzajú).


```mermaid
---
title: UML Diagram
---
classDiagram
    class Kniha{
        -nazov: String
        -author: Author
        -rokVydania: int
        -kapitoly: ArrayList~Kapitola~
        +Kniha(pocetKapitol: int)
        +pocetPismen()
        +setKapitolu(Kapitola k)
        +zobraz()
    }
    class Kapitola{
        -nazov: String
        -obsah: String
        +Kapitola(nazov: String, obsah String)
        +getNazov(): String
        +getObsah(): String
    }
    class Author{
        -meno: String
        -priezvisko: String
        +Author(String meno, String priezvisko)
        +getMeno(): String
        +getPriezvisko(): String
    }
    class Kniznica{
        -nazov: String
        -adresa: String
        -knihy: ArrayList~Kniha~
        +Kniznica(int pocetKnih)
        +setNazov(nazov: String)
        +setAdresa(adresa: String)
        +getNazoV(): String
        +getAdresa(): String
        +SetKnihu(kniha: Kniha)
        +zobrazKnihy()
    }
    Kapitola --|> Kniha
    Author --|> Kniha
    Kniha --|> Kniznica
```