package task.task4;

import java.util.ArrayList;

import static java.lang.System.*;

public class ListOfNumbers {
    ArrayList<Double> skaiciusSarasas;

    public ListOfNumbers() {
        this.skaiciusSarasas = new ArrayList<>();
    }

    public void addNumber(Double num) {
        this.skaiciusSarasas.add(num);
    }

    public Double getAverage() {
        if (skaiciusSarasas.isEmpty()) {
            return null;
        }

        Double sum = 0d;
        for (Double d : skaiciusSarasas) {
            sum += d;
        }
        return sum / skaiciusSarasas.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "skaiciusSarasas=" + skaiciusSarasas +
                '}';
    }
}
