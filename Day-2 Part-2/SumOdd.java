import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a[] = new int[10];
       int len = a.length;
       int sum = 0;
       for(int i=0;i < len;i++){
           a[i] = sc.nextInt();
       }

       for(int i=0;i < len;i++){
           if(a[i] % 2 != 0){
               sum += a[i];
           }
       }
       sc.close();
       System.out.println("Sum of odd numbers: " + sum);
    }
}
