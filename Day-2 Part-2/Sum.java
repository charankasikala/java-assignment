import java.util.Scanner;

public class Sum {

    public static void print(int x[], int n) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int i = 0; i < n; i++) {
            int absVal = Math.abs(x[i]);
            if (absVal >= 0 && absVal <= 9) {
                singleDigitSum += x[i];
            } else if (absVal >= 10 && absVal <= 99) {
                doubleDigitSum += x[i];
            }
        }

        System.out.println("Sum of single digit numbers: " + singleDigitSum);
        System.out.println("Sum of double digit numbers: " + doubleDigitSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr, len);
    }
}
