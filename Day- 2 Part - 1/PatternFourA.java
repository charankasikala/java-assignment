import java.util.Scanner;
class PatternFourA {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int rows = sc.nextInt();
        int i = 0;
        do{
            int num = 1;
            int j = 0;
            int space = 1;
            do{
                if(space <= rows - i - 1){
                    System.out.print(" ");
                }
                space++;
            }while(space <= rows);
            do{
                if(j == 0 || i == 0){
                    num = 1;
                }
                else{
                    num = num * (i-j + 1)/j;
                }
                System.out.print(num + " ");
                j++;

            }while(j <= i);
            System.out.println();
            i++;
        }while(i < rows);

    }
}