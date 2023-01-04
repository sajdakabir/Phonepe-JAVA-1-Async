import java.util.*;

public class Solution {

    static List chessProdigy(int[] ratings) {
        ArrayList<Integer> prodigies = new ArrayList<>();
        int sum = 0;
        for (int i = ratings.length - 1; i >= 0; i--) {
        if (ratings[i] > sum) {
        prodigies.add(ratings[i]);
        }
        sum += ratings[i];
        }
        Collections.reverse(prodigies);
        return prodigies;
    }

    public static void main(String args[]) {

        assert Arrays.asList(27, 8, 3).equals(chessProdigy(new int[] { 16, 27, 1, 3, 8, 3 })) : "Expect {27, 8, 3} for array={16, 27, 1, 3, 8, 3}";
        System.out.println("All test cases in main function passed");

    }
}

