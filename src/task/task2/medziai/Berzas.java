package task.task2.medziai;

import java.util.List;

import static java.lang.System.*;

public class Berzas extends Lapuotis {
    @Override
    public String toString() {
        return "Beržas";
    }

    public static void berzuMiskas(List<Berzas> arraylist) {
        out.println("\nBeržų miškas:");
        for (Berzas b : arraylist) {
            b.turi();
        }
    }
}
