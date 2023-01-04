import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution {

    public static int calculateBankBalance(int n) {
        int remaining = Integer.MAX_VALUE - n;
         return remaining;
    }

    public static void main(String args[]) {
        int n = 483647;
        assert calculateBankBalance(n) == 2147000000 : "Expect 2147000000 for n = 483647";
        System.out.println("All test cases in main function passed");
    }
}

