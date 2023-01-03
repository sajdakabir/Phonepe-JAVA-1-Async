import java.util.*;

public class Solution {
    private static final String[] FRUITS = {"apple", "banana", "orange"};
    private String fruit;

    public Solution() {
        Random random = new Random();
        fruit = FRUITS[random.nextInt(FRUITS.length)];
    }

    public String GetFruit() {
        return fruit;
    }


    public static void main(String args[]) {
        Solution obj1 = new Solution();
        System.out.println(obj1.GetFruit());
        Solution obj2 = new Solution();
        System.out.println(obj2.GetFruit());
    }
}

