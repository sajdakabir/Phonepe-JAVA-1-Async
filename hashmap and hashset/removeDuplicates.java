import java.util.*;

public class Solution {

  static int[] distinctNumbers(int[] arr) {
       LinkedHashSet<Integer> distinctNumbers = new LinkedHashSet<>();
        
        for (int num : arr) {
            distinctNumbers.add(num);
        }
       
        int[] result = new int[distinctNumbers.size()];
        
        int i = 0;
        for (int num : distinctNumbers) {
            result[i] = num;
            i++;
        }
      
        return result;
  }

  public static void main(String args[]) {
    assert Arrays.equals(new int[] { 3, 2, 1, 11 }, distinctNumbers(new int[] { 3, 2, 3, 3, 1, 11, 11, 1, 2, 3 })) : "Expect {3, 2, 1, 11} for arr={ 3, 2, 3, 3, 1, 11, 11, 1, 2, 3 }";
    System.out.println("All test cases in main function passed");
  }
}

