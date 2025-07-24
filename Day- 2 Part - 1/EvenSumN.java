import java.util.Scanner;

public class EvenSumN{
    public static int evenSum(int N){
        int sum = 0;
        for(int i=1;i<=N;i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = evenSum(N);
        System.out.println("Sum of even numbers from 1 to " + N + " is: " + result);


    }
}


