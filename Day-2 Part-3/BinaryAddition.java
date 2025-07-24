import java.util.Scanner;

class BinaryAddition{
    public void addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder s = new StringBuilder();
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i) - '0';
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
            }
            s.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;

        }
        if(carry > 0){
            s.append(carry);
        }
        System.out.println(s.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        BinaryAddition add = new BinaryAddition();
        add.addBinary(a, b);

    }
}

/* Output:
11
 1
-----
100
*/