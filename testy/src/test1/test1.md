1. Podľa nasledovného UML diagramu implementujte triedy. Pokúste sa odhadnúť (a navrhnúť) vhodnú implementáciu metód. V
   metóde main vytvorte príklad vytvorenia inštancie triedy a demonštrujte volanie metód.

```mermaid
classDiagram
    class Motor{
        -znacka: String
        -vykon: int
        -stav: Stav
        +Motor(znacka: String, vykon: int)
        +nastartuj()
        +zastav()
        +zobraz()
    }
    class Stav {
        <<enumeration>>
        NASTAVENY
        ZASTAVENY
    }
   Motor --> Stav  

```

2. Podľa nasledovného UML diagramu implementujte triedy. Pokúste sa odhadnúť (a navrhnúť) vhodnú implementáciu metód. V
   metóde main vytvorte príklad vytvorenia inštancie triedy a demonštrujte volanie metód.

```mermaid
classDiagram
    class Pocitac{
        -cpu: String
        -memory: int
        -stav: Stav
        +Pocitac(cpu: String, memory: int)
        +zapni()
        +vypni()
        +zobraz()
    }
    class Stav{
        <<enumeration>>
        ZAPNUTY
        VYPNUTY
    }
    Pocitac --> Stav
```
