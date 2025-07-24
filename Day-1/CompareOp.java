public class CompareOp {
    public static void main(String[] args) {
        int num1 = 65;
        int num2 = 65;
        int result = num1 ^ num2;
        switch(result){
          case 0: System.out.println("Num1 & Num2 Equal: " + true);
                  break;
          default: System.out.println("Num1 & Num2 Equal: " + false);
                  break;
        }
        
    }
}