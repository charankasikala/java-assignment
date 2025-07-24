import java.util.Scanner;
class StringSegment {
    public int countSegments(String s) {
        int count = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) != ' ' && (i==0 || s.charAt(i-1) == ' ')){
                count ++;
            }
        }
        return count;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringSegment seg = new StringSegment();
		int count = seg.countSegments(s);
		System.out.println("No of segments: " + count);
		
	}
}