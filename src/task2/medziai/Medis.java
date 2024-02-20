package task2.medziai;

import java.util.List;

public interface Medis {
    void turi();

    static void ivairusMiskas(List<? extends Medis> arraylist) {
        System.out.println("\nĮvairus miškas:");
        for (Medis m : arraylist) {
            m.turi();
        }
    }
}
