package task_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<String> zodziai=new ArrayList<>(Arrays.asList("Hello", "World"));
        printArray(skaiciai);
        printArray(zodziai);
    }

    public static <T> void printArray(ArrayList<T> arrayList){

        for (T it:arrayList) {
            System.out.println(it);
        }
    }
}