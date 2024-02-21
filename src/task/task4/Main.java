package task.task4;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        ListOfNumbers list1 = new ListOfNumbers();
        list1.addNumber(1.15d);
        list1.addNumber(2.25d);
        list1.addNumber(3.45d);
        list1.addNumber(6.47);
        ListOfNumbers list2 = new ListOfNumbers();
        list2.addNumber(1d);
        list2.addNumber(2d);
        list2.addNumber(3d);
        list2.addNumber(6d);
        ListOfNumbers list3 = new ListOfNumbers();
        list3.addNumber(15d);
        ListOfNumbers result1 = findWithMaxAverage(list1, list2, list3);
        ListOfNumbers result2 = findWithMaxAverage(list1, list2);
        out.println(result1);
        out.println(result2);
    }

    public static ListOfNumbers findWithMaxAverage(ListOfNumbers... list) {
        Double max = findMaxAverage(list);
        for (ListOfNumbers l : list) {
            if (l.getAverage().equals(max)) {
                return l;
            }
        }
        return null;
    }

    public static Double findMaxAverage(ListOfNumbers... list) {
        Double max = list[0].getAverage();
        for (ListOfNumbers l : list) {
            if (l.getAverage() > max) {
                max = l.getAverage();
            }
        }
        return max;
    }
}
