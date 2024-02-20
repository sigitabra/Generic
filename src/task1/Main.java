package task1;

public class Main {
    public static void main(String[] args) {
        Integer[] skaiciai = new Integer[]{1, 2, 3};
        String[] zodziai = new String[]{"Hello", "World"};
        printArray(skaiciai);
        printArray(zodziai);
    }
    public static <T> void printArray(T[] array) {
        for (T i : array) {
            System.out.println(i);
        }
    }
}