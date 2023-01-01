import java.util.*;

public class Solution {

    static Boolean nonDecreasingArray(int[] arr) {
      for(int i=1;i<arr.length;i++){
        if(arr[i-1]>arr[i])return false;
      }
      return true;
    }

    public static void main(String args[]) {

      assert (nonDecreasingArray(new int[] { 1, 2, 3 })) : "Expect true for array = {1, 2, 3}";
      System.out.println("All test cases in main function passed");

    }
}

