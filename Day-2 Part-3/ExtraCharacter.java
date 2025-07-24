import java.util.Scanner;

class ExtraCharacter{
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<s.length(); i++){
            sum1 += s.charAt(i);
        }
        for(int i=0; i<t.length(); i++){
            sum2 += t.charAt(i);
        }
        int value = sum2 - sum1;
        return (char) value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        ExtraCharacter e = new ExtraCharacter();
        System.out.println(e.findTheDifference(a,b));

    }
}