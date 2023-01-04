import java.util.*;

public class Solution {

    public static String combineStrings(String str1, String str2) {
           Set<Character> set = new HashSet<>();


        for (int i = 0; i < str1.length(); i++) {
            set.add(str1.charAt(i));
        }

 
        for (int i = 0; i < str2.length(); i++) {
            set.add(str2.charAt(i));
        }


        Set<Character> sortedSet = new TreeSet<>();

        sortedSet.addAll(set);

   
        StringBuilder sortedString = new StringBuilder();

    
        for (Character c : sortedSet) {
            sortedString.append(c);
        }

    
        return sortedString.toString();
    }

    public static void main(String args[]) {

        assert combineStrings("aaab", "bjjj").equals("abj") : "Expect \"abj\" for (\"aaab\",\"bjjj\")";
        System.out.println("All test cases in main function passed");

    }
}

