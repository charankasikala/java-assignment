public class PowerTwo {
    public static void main(String[] args) {
        int num = 256;
        boolean isPowerOfTwo = false;
        if(num <= 0){
            isPowerOfTwo = false;
        }
        else{
            while(num > 1){
                num = num/2;
            }
            if(num == 1){
                isPowerOfTwo = true;
            }
            else{
                isPowerOfTwo = false;
            }
        }
        if(isPowerOfTwo){
            System.out.println("Number is power of 2"); // Number is power of 2
        }
        else{
            System.out.println("Number is not power of 2");
        }
    }
}
