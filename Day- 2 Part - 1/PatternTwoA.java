public class PatternTwoA {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == i || j == rows - i - 1) {
                    System.out.print("1");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
