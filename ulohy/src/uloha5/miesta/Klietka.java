package uloha5.miesta;

import uloha5.shopnosti.Behajuce;
import uloha5.shopnosti.Lietajuce;
import uloha5.zvierata.Zviera;

public class Klietka extends Miesto {
    public void umiestniZviera(Behajuce b) {
        zviera = (Zviera) b;
    }

    public void umiestniZviera(Lietajuce l) {
        zviera = (Zviera) l;
    }

    @Override
    public String opis() {
        if (zviera == null)
            return "Klietka je prazdna";
        return "Klietka s " + zviera.opis() + " v nej";
    }
}
