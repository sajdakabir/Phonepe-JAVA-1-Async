import java.util.*;

public class Solution {

    static String gradeMarks(double x) {
        if(x>=0 && x<25)return "F";
        if(x>=20 && x<45)return "E";
        if(x>=45 && x<50)return "D";
        if(x>=50 && x<60)return "C";
        if(x>=50 && x<80)return "B";
        if(x>=80 && x<100)return "A";
        return "Invalid";
    }

    public static void main(String args[]) {

        assert gradeMarks(83.5).equals("A") : "Expect \"A\" for marks = 83.5";
        assert gradeMarks(42).equals("E") : "Expect \"E\" for marks = 42";

        System.out.println("All test cases in main function passed");


    }
}

