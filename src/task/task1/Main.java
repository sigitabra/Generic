package task.task1;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Integer[] skaiciai = new Integer[]{1, 2, 3};
        String[] zodziai = new String[]{"Hello", "World"};
        printArray(skaiciai);
        printArray(zodziai);
    }
    public static <T> void printArray(T[] array) {
        for (T i : array) {
            out.println(i);
        }
    }
}