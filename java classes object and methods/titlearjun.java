import java.util.*;

public class Solution {

    static String chessGrandmaster(String[] games) {
        int winCount = 0;
    for (String game : games) {
        if (game.equals("Win")) {
            winCount++;
        }
    }


    if (winCount >= 5) {
        return "Grand Master";
    } else if (winCount == 0) {
        return "Master";
    } else {
        return "International Master";
    }
    }

    public static void main(String args[]) {
        assert chessGrandmaster(new String[] { "Loss", "Loss", "Loss" }).equals("Master") : "Expect \"Master\" for no wins";
        assert chessGrandmaster(new String[] { "Win", "Win", "Win" }).equals("International Master") : "Expect \"International Master\" for 3 wins";
        assert chessGrandmaster(new String[] { "Win", "Win", "Win", "Win", "Win" }).equals("Grand Master") : "Expect \"Grand Master\" for 5 wins";
      System.out.println("All test cases in main function passed");

    }
}

