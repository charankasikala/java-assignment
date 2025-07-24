import java.util.Scanner;
class StringAdd {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder s = new StringBuilder();
        
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0){
                sum += num1.charAt(i) - '0';
            }
            if(j >= 0){
                sum += num2.charAt(j) - '0';
            }
            
            s.append(sum % 10);
            carry = sum/10;
            i--;
            j--;
            
        }
        if(carry > 0){
            s.append(carry);
        }
        return s.reverse().toString();
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		StringAdd obj = new StringAdd();
		String res = obj.addStrings(a, b);
		System.out.println("Sum of 2 strings: " + res);
		
	}
}