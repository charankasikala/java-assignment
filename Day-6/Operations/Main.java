import arithmetic.ArithmeticOperations;
import stringutils.StringOperations;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value a:");
        int a = sc.nextInt();
        System.out.println("Enter Value b:");
        int b = sc.nextInt();
        System.out.println("Enter String a1:");
        String a1 = sc.next();
        System.out.println("Enter String b1:");
        String b1 = sc.next();

        ArithmeticOperations op1 = new ArithmeticOperations();
        System.out.println("Arithmetic Operations");
        System.out.println("Addition of a & b: " + op1.addition(a, b));
        System.out.println("Subtraction of a & b: " + op1.subtraction(a, b));
        System.out.println("Multiplication of a & b: " + op1.multiplication(a, b));
        System.out.println("Division of a & b: " + op1.division(a, b));
        System.out.println("Modulus of a & b: " + op1.modulus(a, b));
        System.out.println();

        StringOperations op2 = new StringOperations();
        System.out.println("String Operations");
        System.out.println("Concatenation of a & b: " + op2.concatenation(a1, b1));
        System.out.println("Reversing a string: " + op2.reverse(a1));
        System.out.println("Length of a string: " + op2.stringlength(a1));
         
    }
}
