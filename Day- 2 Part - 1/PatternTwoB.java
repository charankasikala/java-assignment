public class PatternTwoB {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - 1; j++) {
                if (i == 0 || i == 2) {
                    System.out.print("R ");
                }
                else if (i == 1 && (j == 0 || j == rows - 2)) {
                    System.out.print("R ");
                }
                else if (i == 3 && (j == 0 || j == 2)) {
                    System.out.print("R ");
                }
                else if (i == 4 && (j == 0 || j == rows - 2)) {
                    System.out.print("R ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


/* Output:
R R R R
R     R
R R R R
R   R
R     R
*/