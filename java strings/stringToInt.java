import java.util.*;

public class Solution {

    static int typeConversion(String s) {
         int output = Integer.parseInt(s);
        return (output); 
    }

    public static void main(String args[]) {
        String s = "123";
        assert (typeConversion(s) == 123) : "Expect 123 for s = \"123\"";
        System.out.println("All test cases in main function passed");

    }
}

