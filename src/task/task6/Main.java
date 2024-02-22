package task.task6;

import java.util.Random;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        out.println(new Solution().solution(generateArray()));
    }

    public static int[] generateArray() {
        Random random = new Random();
        int[] array = new int[random.nextInt(1, 100001)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-1000000, 1000001);
        }
        return array;
    }
}
