import java.util.*;

public class Solution {

    static int smallestValueOfArray(int[] numbers, String toReturn) {
         int smallest = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                index = i;
            }
        }
        if (toReturn.equals("value")) {
            return smallest;
        } else if (toReturn.equals("index")) {
            return index;
        } else {
            return smallest; 
        }

    }

    public static void main(String args[]) {
        assert (1 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "value")) : "Expect 1 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        assert (3 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "index")) : "Expect 3 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        System.out.println("All test cases in main function passed");

    }
}
