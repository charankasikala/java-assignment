import java.util.Scanner;
public class MinThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // -3892939
        int num2 = sc.nextInt(); // -3738
        int num3 = sc.nextInt(); // 48392
        int min = 999999999;

        if(num1 < min){
            min = num1;
        }
        if(num2 < min){
            min = num2;
        }
        if(num3 < min){
            min = num3;
        }
        System.out.println("Minimum of 3 nums: " + min); // Minimum of 3 nums: -3892939
    }
}