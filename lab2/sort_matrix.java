/*Write a program to create a matrix of n×m elements and arrange the columns of this matrix in ascending order according to the first elements of each column*/
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of rows (n):");
    int n = scanner.nextInt();
    System.out.println("Enter the number of columns (m):");
    int m = scanner.nextInt();

    // Create the matrix
    int[][] matrix = new int[n][m];

    System.out.println("Enter the elements of the matrix:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    for (int j = 0; j < m; j++) {
      for (int i = 0; i < n - 1; i++) {
        for (int k = 0; k < n - i - 1; k++) {
          if (matrix[k][j] > matrix[k + 1][j]) {
            int temp = matrix[k][j];
            matrix[k][j] = matrix[k + 1][j];
            matrix[k + 1][j] = temp;
          }
        }
      }
    }

    System.out.println("Sorted matrix:");
    for (int i = 0; i < n; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }
  }
}
