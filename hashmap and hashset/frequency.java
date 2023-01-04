import java.util.*;

public class Solution {

    static int modeFrequency(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
        map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        int maxFrequency = 0;
        for (int key : map.keySet()) {
        maxFrequency = Math.max(maxFrequency, map.get(key));
        }
        return maxFrequency;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 3, 3, 3, 1 };
        assert (modeFrequency(arr) == 4) : "Expect 4 for arr = { 3, 3, 3, 3, 1 }";
        System.out.println("All test cases in main function passed");
    }
}

