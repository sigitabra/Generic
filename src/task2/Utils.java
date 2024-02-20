package task2;

import task2.medziai.Berzas;
import task2.medziai.Medis;
import task2.medziai.Spigliuotis;

import java.util.List;

public class Utils {
    private Utils() {
        throw new IllegalStateException("Utility class");
    }
    public static void ivairusMiskas(List<? extends Medis> arraylist) {
        System.out.println("\nĮvairus miškas:");
        for (Medis m : arraylist) {
            m.turi();
        }
    }
    public static void spygliuociuMiskas(List<? extends Spigliuotis> arraylist) {
        System.out.println("\nSpygliuočių miškas:");
        for (Spigliuotis s : arraylist) {
            s.turi();
        }
    }
    public static void berzuMiskas(List<Berzas> arraylist) {
        System.out.println("\nBeržų miškas:");
        for (Berzas b : arraylist) {
            b.turi();
        }
    }
}
