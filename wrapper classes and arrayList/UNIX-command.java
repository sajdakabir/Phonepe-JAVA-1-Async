import java.util.*;

public class Solution {

    static List<String> lineNumbering(List<String> lines) {
          ArrayList<String> result = new ArrayList<>();
        int lineNumber = 1;
        for (String line : lines) {
            result.add(lineNumber + " " + line);
            lineNumber++;
        }
        return result;
    }

    public static void main(String args[]) {

      assert (lineNumbering(Arrays.asList("Hi", "Hello", "Hey")).equals(Arrays.asList("1 Hi", "2 Hello", "3 Hey"))) : "Expect [\"1 Hi\", \"2 Hello\", \"3 Hey\"] for lines = [\"Hi\", \"Hello\", \"Hey\"]";
      System.out.println("All test cases in main function passed");

    }
}

