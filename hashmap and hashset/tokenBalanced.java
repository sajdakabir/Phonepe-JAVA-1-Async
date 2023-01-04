import java.util.*;

public class Solution {

  static Boolean balancedToken(String token) {
     token = token.toLowerCase();

     
        HashMap<Character, Integer> charFrequencies = new HashMap<>();

        for (int i = 0; i < token.length(); i++) {
            char c = token.charAt(i);
           
            if (!charFrequencies.containsKey(c)) {
                charFrequencies.put(c, 1);
            }

            else {
                charFrequencies.put(c, charFrequencies.get(c) + 1);
            }
        }

        int frequency = -1;
        for (int count : charFrequencies.values()) {
            if (frequency == -1) {
                frequency = count;
            }
            else if (count != frequency) {
                return false;
            }
        }

       
        return true;
  }

  public static void main(String args[]) {
    assert balancedToken("Dererd") == true : "Expect true for input =\"Dererd\"";
    System.out.println("All test cases in main function passed");
  }
}

