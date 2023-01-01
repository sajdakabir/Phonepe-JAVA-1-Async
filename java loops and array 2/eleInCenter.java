import java.util.*;

public class Solution {

    public static Integer matrixCenter(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
        return null;
    }

    // Calculate the dimensions of the matrix
    int rows = matrix.length;
    int cols = matrix[0].length;

    // Check if the matrix has an odd number of rows and columns
    if (rows % 2 == 1 && cols % 2 == 1) {
        // Return the element at the center of the matrix
        return matrix[rows / 2][cols / 2];
    } else {
        // The matrix doesn't have a center element
        return null;
    }
    }

    public static void main(String args[]) {

        assert (matrixCenter(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }) == 5) : "Expect 5 from { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }";
        System.out.println("All test cases in main function passed");

    }
}

