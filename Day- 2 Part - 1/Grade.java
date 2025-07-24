import java.util.Scanner;

public class Grade {
    public static char usingIfElse(double percentage){
        if(percentage>=85 && percentage<=100){
            return 'A';
        }
        else if(percentage>=70){
            return 'B';
        }
        else if(percentage>=50){
            return 'C';
        }
        else{
            return 'F';
        }
    }
    public static char usingSwitch(double percentage){
        int percent = (int) percentage/10;
        switch(percent){
            case 10:
            case 9:
            case 8: if(percentage>=85 && percentage<=100){
                    return 'A';
                    }
                    else{
                        return 'B';
                    }
            case 7: return 'B';
            case 6: 
            case 5: return 'C';
            default: return 'F';


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Enter" + N + " Subject Marks ");

        int sum = 0;
        for(int i=1;i<=N;i++){
            System.out.println("Enter Subject" + i + " Marks: ");
            sum += sc.nextInt();
        }
        double percentage = (double) sum/N;
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade Using IfElse: " + usingIfElse(percentage));
        System.out.println("Grade Using Switch: " + usingSwitch(percentage));

    }
}

/* Output:
3
Enter3 Subject Marks
Enter Subject1 Marks:
84
Enter Subject2 Marks:
84 
Enter Subject3 Marks:
84
Percentage: 84.0
Grade Using IfElse: B
Grade Using Switch: B
*/