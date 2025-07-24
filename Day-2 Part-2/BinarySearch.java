import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int grad [] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        Arrays.sort(grad);
        int left = 0;
        int right = grad.length-1;
        boolean isFound = false;
        while(left <= right){
            int mid = (left+right)/2;
            if(grad[mid] == year){
                isFound = true;
                break;
            }
            else if(grad[mid] < year){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        if(!isFound) {
            System.out.println("Record Does Not Exists");
        }
        else{
            System.out.println("Record Exists");
        }

    }
}
