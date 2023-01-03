import java.util.*;

public class Solution {

    public static String addSpaces(String words[]) {
    if (words == null) {
      return null;
    }
    if (words.length == 0) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      sb.append(words[i]);
      if (i < words.length - 1) {
        sb.append(" ");
      }
    }
    return sb.toString();
    }

    public static void main(String args[]) {
        String[] arr = { "Hello", "World" };
        assert addSpaces(arr).equals("Hello World") : "Expect \"Hello world\" for words = {Hello, World}";
        arr = new String[0];
        assert addSpaces(arr).equals("") : "Expect \"\" for input = [] or input = new String[0]";
        System.out.println("All test cases in main function passed");
    }
}

