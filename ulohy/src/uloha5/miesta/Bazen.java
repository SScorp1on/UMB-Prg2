package uloha5.miesta;

import uloha5.shopnosti.Plavajuce;
import uloha5.zvierata.Zviera;

public class Bazen extends Miesto {
    public void umiestniZviera(Plavajuce p) {
        zviera = (Zviera) p;
    }

    @Override
    public String opis() {
        if (zviera == null)
            return "Bazen je prazdny";
        return "Bazen s " + zviera.opis() + " v nom";
    }
}
