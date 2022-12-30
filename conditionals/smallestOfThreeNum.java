import java.util.*;

public class Solution {

  public static int findSmallest(int a, int b, int c) {
     int smallest;
         
       
        if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
         
  return smallest;
  }

  public static void main(String args[]) {
        assert (findSmallest(1, 9, 78) == 1) : "Expect 1 for a = 1, b = 9, c = 78";
        System.out.println("All test cases in main function passed");

    }
}

