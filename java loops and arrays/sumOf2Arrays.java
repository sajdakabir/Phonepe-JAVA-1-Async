import java.util.*;

public class Solution {

    public static int sumOfTwoArrays(int[] arr1, int[] arr2) {
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum=sum+arr1[i];
        }
          for(int i=0;i<arr2.length;i++){
            sum=sum+arr2[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        assert (sumOfTwoArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }) == 21) : "Expect 21 for {1,2,3},{4,5,6}";
        System.out.println("All test cases in main function passed");

    }
}

// another

 import java.util.*;

public class Solution {

    public static int sumOfTwoArrays(int[] arr1, int[] arr2) {
        int arrSum = 0;
        for (int num : arr1) {
            arrSum += num;
        }
        for (int num : arr2) {
            arrSum += num;
        }
        return arrSum;

    }

    public static void main(String args[]) {
        assert (sumOfTwoArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }) == 21) : "Expect 21 for {1,2,3},{4,5,6}";
        System.out.println("All test cases in main function passed");

    }
}