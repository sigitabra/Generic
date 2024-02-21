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
        Double sum = 0d;
        Double average = null;
        for (Double d : skaiciusSarasas) {
            sum += d;
        }
        try {
            average = sum / skaiciusSarasas.size();

        } catch (Exception e) {
            out.println(e.getMessage());
        }

        return average;
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "skaiciusSarasas=" + skaiciusSarasas +
                '}';
    }
}
