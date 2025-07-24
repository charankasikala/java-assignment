
public class PatternThreeA {
    public static void main(String[] args) {
		int rows = 5;
        int row = 1;
        int num = 1;
        int leftspace;
        int middlespace;

        while(row <= rows) {
            String s = "";
            if(row == 1 || row == rows) {
                leftspace = rows - 1;
                while(leftspace > 0) {
                    s += "  "; 
                    leftspace--;
                }
                System.out.print(s + num++);
            }
            else if(row == 2 || row == rows - 1) {
                leftspace = rows - 2;
                while(leftspace > 0) {
                    s += "  ";
                    leftspace--;
                }
                s += num++ + "   ";
                s += num++;
                System.out.print(s);
            }
            else {
                leftspace = rows - row;
                while(leftspace > 0) {
                    s += "  ";
                    leftspace--;
                }
                s += num++ + "   ";
                s += num++ + "   ";
                s += num++;
                System.out.print(s);
            }

            System.out.println();
            row++;
        }
    }
}
