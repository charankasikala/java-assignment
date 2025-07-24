import java.util.Scanner;

public class BitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 1;
        String binary_num = Integer.toBinaryString(n);
        for(int i=binary_num.length()-1;i>=0;i--) {
            if(binary_num.charAt(i) == '1') {
                System.out.println(pos);
                break;
            }
            else {
                pos ++;
            }
        }
        sc.close();
    }
}