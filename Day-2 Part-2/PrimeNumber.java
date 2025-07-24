import java.util.Scanner;
import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        String res = "";
        int prime[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            prime[i] = sc.nextInt();
        }
        Arrays.sort(prime);
        for (int i = 0; i < 10; i++) {
            if (isPrime(prime[i])) {
                res += prime[i] + " ";
            }
        }
        System.out.println("Prime numbers:");
        System.out.println(res);

    }   

    public static boolean isPrime(int num) {
        if(num <=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}


