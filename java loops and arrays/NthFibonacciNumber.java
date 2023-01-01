import java.util.*;

public class Solution {

    static int getNthFibonacciNumber(int N) {

         if (N <= 1)
        return N;
    return getNthFibonacciNumber(N - 1) + getNthFibonacciNumber(N - 2);
    }

    public static void main(String args[]) {

        assert (getNthFibonacciNumber(3) == 2) : "Expect \"2\" for N = 3";
        assert (getNthFibonacciNumber(4) == 3) : "Expect \"3\" for N = 4";
        System.out.println("All test cases in main function passed");


    }
}

