import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int fib[] = new int[30];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < 30; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println("Fibonacci Series:");
        System.out.println(Arrays.toString(fib));


    }
}