package task.task2.medziai;

import java.util.List;

import static java.lang.System.*;

public interface Medis {
    void turi();

    static void ivairusMiskas(List<? extends Medis> arraylist) {
        out.println("\nĮvairus miškas:");
        for (Medis m : arraylist) {
            m.turi();
        }
    }
}
