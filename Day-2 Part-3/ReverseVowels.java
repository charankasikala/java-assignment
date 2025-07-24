import java.util.Scanner;
class ReverseVowels {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int start = 0;
        int end = a.length-1;
        while(start < end){
            if(!isVowel(a[start])){
                start++;
            }
            else if(!isVowel(a[end])){
                end--;
            }
            else{
                char temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(a);
    }

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        else{
            return false;
        }
        
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		ReverseVowels obj = new ReverseVowels();
		String res = obj.reverseVowels(word);
		System.out.println("String after reversing Vowels: " + res);
	}
}

