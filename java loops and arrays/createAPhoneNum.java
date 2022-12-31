import java.util.*;

public class Solution {

  public static String createPhoneNumber(int[] a) {
    String ans="";
    for(int i=0;i<10;i++){
      ans=ans+String.valueOf(a[i]);
      if(a[i]==10)ans=ans+"0";
    }
    return ans;
  }

  public static void main(String args[]) {
        assert (createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0}).equals("1234567890")) : "Expect 1234567890 for a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]";
        System.out.println("All test cases in main function passed");

    }
}
