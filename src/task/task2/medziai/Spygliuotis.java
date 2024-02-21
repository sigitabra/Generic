package task.task2.medziai;

import java.util.List;

import static java.lang.System.*;

public class Spygliuotis implements Medis {
    @Override
    public void turi() {
        out.println(this + " turi spyglius.");
    }

    @Override
    public String toString() {
        return "Spygliuotis";
    }

    public static void spygliuociuMiskas(List<? extends Spygliuotis> arraylist) {
        out.println("\nSpygliuočių miškas:");
        for (Spygliuotis s : arraylist) {
            s.turi();
        }
    }
}
