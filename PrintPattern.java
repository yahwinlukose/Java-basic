import java.util.*;

class MatrixPattern {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {2, 1, 1}
        };

        int rows = 2, cols = 3;

        // Print rows with row sums
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
                rowSum += arr[i][j];
            }
            System.out.println("| " + rowSum);
        }

        // Print separator line
        System.out.println("-------------");

        // Print column sums
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
            }
            System.out.print(colSum + " ");
        }
    }
}
