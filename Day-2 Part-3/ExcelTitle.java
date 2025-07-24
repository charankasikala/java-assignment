import java.util.Scanner;
class ExcelTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem); 
            s.append(ch);
            columnNumber /= 26; 
        }
        return s.reverse().toString();
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ExcelTitle title = new ExcelTitle();
		String result = title.convertToTitle(num);
		System.out.println("Excel Title of " + num +" is: " + result);
	}
}
