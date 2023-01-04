import java.util.*;

public class Solution {
        private HashMap<String, String> meanings;

    public Solution() { // constructor
    
            meanings = new HashMap<>();
        // your code
    }

    public void addWord(String key, String value) {
                meanings.put(key, value);
        // your code
    }

    public String lookUp(String key) {
         if (meanings.containsKey(key)) {
            return meanings.get(key);
        }
        return "No entry found for " + key;
        // your code
    }

    public static void main(String args[]) {

        Solution dict = new Solution();
        dict.addWord("Mango", "A yellow colored fruit");
        assert (dict.lookUp("Mango").equals("A yellow colored fruit")) : "Expect \"A yellow colored fruit\" when looking up \"Mango\"";
        assert (dict.lookUp("Kiwi").equals("No entry found for Kiwi")) : "Expect \"No entry found for Kiwi\" when looking up \"Kiwi\"";

        System.out.println("All test cases in main function passed");

    }
}

