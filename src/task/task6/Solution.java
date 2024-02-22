package task.task6;

import java.util.Arrays;
import java.util.HashSet;

import static java.lang.System.*;

public class Solution {
    public int solution(int[] a) {
        out.println(Arrays.toString(a));
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : a) {
            hashSet.add(num);
        }
        for (int i = 1; i < hashSet.size(); i++) {
            if (!hashSet.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}
