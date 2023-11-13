```mermaid
classDiagram
    class Ryba{
        -x: int
        -y: int
        +akvarium.obsah.Ryba(x: int, y: int)
        +getX(): int
        +getY(): int
        +nachadzaSa(x: int, y: int): boolean
        +incrementX()
    }
    class Akvarium{
        -sirka: int
        -vyska: int
        -pocetRyb: int
        -ryby: LinkedList~akvarium.obsah.Ryba~
        +akvarium.Akvarium(sirka: int, vyska: int, pocetRyb: int)
        +zobraz()
        +posun()
    }
    Akvarium "1" -- "1..*" Ryba
```