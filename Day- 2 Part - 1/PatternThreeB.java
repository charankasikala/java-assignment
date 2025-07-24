public class PatternThreeB {
    public static void main(String[] args) {
        int n_rows = 5;
        int row = 1;
        while(row <= n_rows) {
            int count = 0;
            int limit;
            if(row == 1 || row == n_rows) {
                limit = 1;
            }
            else if (row == 2 || row == n_rows - 1) {
                limit = 2;
            }
            else{
                limit = 3;
            }
            while(count < limit) {
                System.out.print("w" + " ");
                count++;
            }
            System.out.println();
            row++;

        }
    }
}
