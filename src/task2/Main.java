package task2;

import task2.medziai.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Spigliuotis> spygliuociai = new ArrayList<>(Arrays.asList(new Pusis(), new Pusis(), new Egle(), new Egle()));
        Utils.spygliuociuMiskas(spygliuociai);
        ArrayList<Egle> egles = new ArrayList<>(Arrays.asList(new Egle(), new Egle(), new Egle(), new Egle()));
        Utils.spygliuociuMiskas(egles);
        ArrayList<Medis> ivairus = new ArrayList<>(Arrays.asList(new Azuolas(), new Berzas(), new Berzas(), new Kadagys(), new Kadagys()));
        Utils.ivairusMiskas(ivairus);
        ArrayList<Berzas> berzai = new ArrayList<>(Arrays.asList(new Berzas(), new Berzas(), new Berzas()));
        Utils.berzuMiskas(berzai);

        Utils.ivairusMiskas(berzai);
        Utils.ivairusMiskas(egles);
        Utils.ivairusMiskas(spygliuociai);
    }
}
