import java.util.*;

public class Solution {

    static boolean isMagicSquare(int[][] matrix) {
          // Check if the matrix is empty
    if (matrix.length == 0 || matrix[0].length == 0) {
        return false;
    }

    // Calculate the dimensions of the matrix
    int n = matrix.length;

    // Calculate the sum of the first row
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += matrix[0][i];
    }

    // Check if all rows have the same sum
    for (int i = 1; i < n; i++) {
        int rowSum = 0;
        for (int j = 0; j < n; j++) {
            rowSum += matrix[i][j];
        }
        if (rowSum != sum) {
            return false;
        }
    }

    // Check if all columns have the same sum
    for (int i = 0; i < n; i++) {
        int colSum = 0;
        for (int j = 0; j < n; j++) {
            colSum += matrix[j][i];
        }
        if (colSum != sum) {
            return false;
        }
    }

    // Check if the two diagonals have the same sum
    int diagonalSum1 = 0;
    int diagonalSum2 = 0;
    for (int i = 0; i < n; i++) {
        diagonalSum1 += matrix[i][i];
        diagonalSum2 += matrix[i][n - i - 1];
    }
    if (diagonalSum1 != sum || diagonalSum2 != sum) {
        return false;
    }

    // If all checks pass, the matrix is a magic square
    return true;
    }

    public static void main(String args[]) {

        int[][] arr1 = {{4,9,2}, {3,5,7}, {8,1,6}};
        assert isMagicSquare(arr1) == true : "Expect true for arr = {{4,9,2}, {3,5,7}, {8,1,6}}";

        int[][] arr2 = {{4,9,2}, {3,5,9}, {8,1,6}};
        assert isMagicSquare(arr2) == false : "Expect false for arr = {{4,9,2}, {3,5,9}, {8,1,6}}";
        System.out.println("All test cases in main function passed");

    }
}

