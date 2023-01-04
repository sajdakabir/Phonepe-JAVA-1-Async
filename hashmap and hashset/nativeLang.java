import java.util.*;

public class Solution {

    static String findLanguage(String country) {
         HashMap<String, String> countryLanguages = new HashMap<>();
        countryLanguages.put("Australia", "English");
        countryLanguages.put("England", "English");
        countryLanguages.put("Brazil", "Portuguese");
        countryLanguages.put("China", "Chinese");
        countryLanguages.put("France", "French");
        countryLanguages.put("Spain", "Spanish");
        countryLanguages.put("Germany", "German");
        countryLanguages.put("Japan", "Japanese");
        countryLanguages.put("Greece", "Greek");
        countryLanguages.put("India", "Hindi");
  
        String nativeLanguage = countryLanguages.get(country);
        return (nativeLanguage); 
    }

    public static void main(String args[]) {

      assert findLanguage("Australia").equals("English") : "Expect \"English\" for country = \"Australia\"";
      System.out.println("All test cases in main function passed");

    }
}
