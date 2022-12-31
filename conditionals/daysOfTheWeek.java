import java.util.*;

public class Solution {

  public static String dayOfTheWeek(int day) {
    String ans="";
    switch(day){
      case 1:
        ans= "Monday";
        break;
      case 2:
        ans= "Tuesday";
        break;
      case 3:
        ans= "Wednesday";
        break;
      case 4:
        ans= "Thursday";
        break;
      case 5:
        ans= "Friday";
        break;
      case 6:
        ans= "Saturday";
        break;
      case 7:
        ans= "Sunday";
        break;
    default:
    ans="Invalid";
    }
    return ans;
  }

  public static void main(String args[]) {
        assert (dayOfTheWeek(6).equals("Saturday")) : "Expect Saturday for day = 6";
        System.out.println("All test cases in main function passed");
    }
}

