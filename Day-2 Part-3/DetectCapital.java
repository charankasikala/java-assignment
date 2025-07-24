import java.util.Scanner;

class DetectCapital{
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        boolean isFirstCapital = false;
        int count = 0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(i ==0 && Character.isUpperCase(ch)){
                isFirstCapital = true;
                count ++;
            }
            else if(i != 0 && Character.isUpperCase(ch)){
                count ++;
            }
        }
        if(count == len || count == 0){
            return true;
        }
        else if(isFirstCapital && count == 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        DetectCapital obj = new DetectCapital();
        System.out.println(obj.detectCapitalUse(a));

    }
}