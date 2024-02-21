package task.task2.medziai;

import static java.lang.System.*;

public class Lapuotis implements Medis {
    @Override
    public void turi() {
        out.println(this + " turi lapus.");
    }

    @Override
    public String toString() {
        return "Lapuotis";
    }
}
