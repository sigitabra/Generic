package task2.medziai;

import java.util.List;

public class Spygliuotis implements Medis {
    @Override
    public void turi() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Spygliuotis turi spyglius.";
    }

    public static void spygliuociuMiskas(List<? extends Spygliuotis> arraylist) {
        System.out.println("\nSpygliuočių miškas:");
        for (Spygliuotis s : arraylist) {
            s.turi();
        }
    }
}
