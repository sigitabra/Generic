package task.task2;

import task.task2.medziai.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Spygliuotis> spygliuociai = new ArrayList<>(Arrays.asList(new Pusis(), new Pusis(), new Egle(), new Egle()));
        Spygliuotis.spygliuociuMiskas(spygliuociai);
        ArrayList<Egle> egles = new ArrayList<>(Arrays.asList(new Egle(), new Egle(), new Egle(), new Egle()));
        Spygliuotis.spygliuociuMiskas(egles);
        ArrayList<Medis> ivairus = new ArrayList<>(Arrays.asList(new Azuolas(), new Berzas(), new Berzas(), new Kadagys(), new Kadagys()));
        Medis.ivairusMiskas(ivairus);
        ArrayList<Berzas> berzai = new ArrayList<>(Arrays.asList(new Berzas(), new Berzas(), new Berzas()));
        Berzas.berzuMiskas(berzai);

        Medis.ivairusMiskas(berzai);
        Medis.ivairusMiskas(egles);
        Medis.ivairusMiskas(spygliuociai);
    }
}
