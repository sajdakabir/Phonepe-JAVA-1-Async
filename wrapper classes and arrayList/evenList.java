import java.util.*;


public class Solution {

    public static List<Integer> filterEven(List<Integer> inputList) {
        List<Integer> resultList = new LinkedList<>();
    for (int i = 0; i < inputList.size(); i++) {
        if (inputList.get(i) % 2 != 0) {
            resultList.add(inputList.get(i));
        }
    }
    return resultList;
    }

    public static void main(String args[]) {
        List<Integer> inputList = new LinkedList<>(Arrays.asList(1, 2, 6, 7, 9, 10));
        List<Integer> expectedOutputList = new LinkedList<>(Arrays.asList(1, 7, 9));
        assert filterEven(inputList).equals(expectedOutputList) : "Expect [1,7,9] from [1,2,6,7,9,10]";
        System.out.println("All test cases in main function passed");

    }
}

