import java.util.*;

public class Solution {

  public static String checkBloodDonationEligiblity(int age, int weight) {
    if(age<18)return "UnderAge";
    if (age>18 && weight<50)return "NotEligible";
    return "Eligible";
  }

  public static void main(String args[]) {
        assert (checkBloodDonationEligiblity(25, 55) == "Eligible") : "Expect Eligible for a = 25, b = 55";
        System.out.println("All test cases in main function passed");

    }
}
