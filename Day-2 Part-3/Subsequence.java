import java.util.Scanner;
class Subsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        else{
            int i = 0;
            int j = 0;
            while(i<s.length() && j < t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    i++;
                    j++;
                }
                else{
                    j++;
                }
            }
            if(i==s.length()){
                return true;
            }
            return false;
        }
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		Subsequence sub = new Subsequence();
		boolean result = sub.isSubsequence(s1, s2);
		System.out.println("s is a subsequence of t is : " + result);
		
	}
}