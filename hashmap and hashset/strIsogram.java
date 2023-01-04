import java.util.*;

public class Solution {

    public static boolean isogram(String str) {
      Set<Character> set = new HashSet<>();
      for (char c : str.toCharArray()) {
      if (set.contains(c)) {
      return false;
      }
      set.add(c);
      }
      return true;
    }

    public static void main(String args[]) {

      assert (isogram("aba") == false) : "Expect false for s = \"aba\"" ;
      System.out.println("All test cases in main function passed");

    }
}

