package task2.medziai;

public class Lapuotis implements Medis {
    @Override
    public void turi() {
        System.out.println(this + " turi lapus.");
    }

    @Override
    public String toString() {
        return "Lapuotis";
    }
}
