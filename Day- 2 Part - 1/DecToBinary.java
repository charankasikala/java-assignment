import java.util.Scanner;
public class DecToBinary {
    public String decToBin(int N){
        String binary = "";
		if(N == 0){
			return "0";
		}
        while(N > 0){
            int rem = N % 2;
            binary = rem + binary;
            N = N / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: "); // Enter a decimal number:
        int N = sc.nextInt(); 		// N = 28
        DecToBinary binObj = new DecToBinary();
        String binary = binObj.decToBin(N);
        System.out.println("Decimal to Binary of " + N + ": " + binary);
		// Decimal to Binary of 28: 11100

    }
}