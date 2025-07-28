package stringutils;

public class StringOperations{

    public String concatenation(String a, String b){
        return a + " " + b;
    }

    public String reverse(String a){
        String rev = "";
        for(int i=a.length()-1; i>=0; i--){
            rev += a.charAt(i);
        }
        return rev;
    }

    public int stringlength(String a){
        return a.length();
    }
}
