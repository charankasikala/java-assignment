import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student [][]= new int[10][4];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter roll no:");
            student[i][0] = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter marks in subject " + (j + 1) + ":");
                student[i][j + 1] = sc.nextInt();
            }
        }
        System.out.println(String.format("%-10s %-10s %-10s","RollNo", "Total Marks", "Average"));
        System.out.println("____________________________________________________________");
        for(int i=0;i<10;i++){
            int total = 0;
            for(int j=0;j<3;j++){
                total+=student[i][j+1];
            }
            System.out.println(String.format("%-10d %-10d %-10.2f",student[i][0],total,total/3.0));
        }

    }
}

