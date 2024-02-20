package task2.medziai;

import java.util.List;

public class Spygliuotis implements Medis {
    @Override
    public void turi() {
        switch (this) {
            case Kadagys kadagys -> System.out.println("Kadagys turi spyglius.");
            case Pusis pusis -> System.out.println("Pušis turi spyglius.");
            case Egle egle -> System.out.println("Eglė turi spyglius.");
            case null, default -> System.out.println("Spygliuotis turi spyglius.");
        }
    }

    public static void spygliuociuMiskas(List<? extends Spygliuotis> arraylist) {
        System.out.println("\nSpygliuočių miškas:");
        for (Spygliuotis s : arraylist) {
            s.turi();
        }
    }
}
