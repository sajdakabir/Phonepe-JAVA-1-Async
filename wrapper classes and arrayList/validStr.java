import java.util.*;

public class Solution {

    public static List<String> atlas(List<String> words) {
         ArrayList<String> validWords = new ArrayList<>();
        if (words == null || words.isEmpty() || words.get(0).isEmpty()) {
            return validWords;
        }
        validWords.add(words.get(0));
        for (int i = 1; i < words.size(); i++) {
            String currentWord = words.get(i);
            if (currentWord.isEmpty()) {
                break;
            }
            char lastLetter = validWords.get(validWords.size() - 1).charAt(validWords.get(validWords.size() - 1).length() - 1);
            if (currentWord.charAt(0) == lastLetter) {
                validWords.add(currentWord);
            } else {
                break;
            }
        }
        return validWords;
    }

    public static void main(String args[]) {
        ArrayList<String> words = new ArrayList<String>(
                Arrays.asList("budapest", "texas", "seattle", "edinburgh", "hokkaido"));
        ArrayList<String> expected = new ArrayList<String>(
                Arrays.asList("budapest", "texas", "seattle", "edinburgh", "hokkaido"));
        assert atlas(words).equals(expected) : "Expect [\"budapest\", \"texas\", \"seattle\", \"edinburgh\", \"hokkaido\"] for list = [\"budapest\", \"texas\", \"seattle\", \"edinburgh\", \"hokkaido\"]" ;
        System.out.println("All test cases in main function passed");
    }
}

