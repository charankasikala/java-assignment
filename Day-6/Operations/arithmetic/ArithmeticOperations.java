package arithmetic;

public class ArithmeticOperations {
    
    public int addition(int a, int b){
        return a + b;
    }

    public int subtraction(int a, int b){
        return a - b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public double division(int a, int b){
        if(b > 0){
            return a/b;
        }
        return Double.NaN;
    }

    public int modulus(int a, int b){
        if(b > 0){
            return a % b;
        }
        return 0;
    }
}
