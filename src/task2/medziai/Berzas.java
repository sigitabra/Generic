package task2.medziai;

import java.util.List;

public class Berzas extends Lapuotis {

    public static void berzuMiskas(List<Berzas> arraylist) {
        System.out.println("\nBeržų miškas:");
        for (Berzas b : arraylist) {
            b.turi();
        }
    }
}