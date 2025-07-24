import java.util.Scanner;

public class Matrix {

    public static void inputMatrix(int[][] A, int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("Enter element " + i + " " + j + ": ");
                A[i][j] = sc.nextInt();
            }
        }
    }
    public static void displayMatrix(int[][] A, int m, int n) {
        System.out.println("Displaying Matrix: ");
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sumMatrix(int[][] A, int m, int n) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                sum += A[i][j];
            }
        }
        System.out.println("Sum of all elements of a Matrix: " + sum);
    }
    public static void rowSumMatrix(int[][] A, int m, int n) {
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for(int j = 0; j < n; j++) {
                rowSum += A[i][j];
            }
            System.out.println("The row wise sum of " + (i+1) + " is:" + rowSum);
        }
    }
    public static void colSumMatrix(int[][] A, int m, int n) {
        for(int j = 0; j < n; j++) {
            int colSum = 0;
            for(int i=0; i<m; i++){
                colSum += A[i][j];
            }
            System.out.println("The Column wise sum of " + (j+1) + " is:" + colSum);
        }
    }
    public static void transposeMatrix(int[][] A, int m, int n) {
        int transpose [][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                transpose[i][j] = A[j][i];
            }
        }
        System.out.println("Transpose of a Matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows:");
        int m = sc.nextInt();
        System.out.print("Enter Number of columns:");
        int n = sc.nextInt();
        int A [][] = new int [m][n];
        inputMatrix(A, m, n);
        displayMatrix(A, m, n);
        sumMatrix(A, m, n);
        rowSumMatrix(A, m, n);
        colSumMatrix(A, m, n);
        transposeMatrix(A, m, n);
    }

}

/* Output:
Enter Number of rows:2
Enter Number of columns:2
Enter element 0 0: 4
Enter element 0 1: 5
Enter element 1 0: 7
Enter element 1 1: 8
Displaying Matrix: 
4 5 
7 8 
Sum of all elements of a Matrix: 24
The row wise sum of 1 is:9
The row wise sum of 2 is:15
The Column wise sum of 1 is:11
The Column wise sum of 2 is:13
Transpose of a Matrix:
4 7
5 8
*/

