package task2.medziai;

public class Lapuotis implements Medis {
    @Override
    public void turi() {
        switch (this) {
            case Azuolas azuolas -> System.out.println("Ąžuolas turi lapus.");
            case Berzas berzas -> System.out.println("Beržas turi lapus.");
            case null, default -> System.out.println("Lapuotis turi lapus.");
        }
    }
}
