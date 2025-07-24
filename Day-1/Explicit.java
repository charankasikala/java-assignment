public class Explicit {
    public static void main(String[] args) {
        int num1 = 100;
        float num2 =  3.2f;
        double num3 = 34.5;
        byte num4 = 45;
        short num5 = 3929;
        char num6 = 'b';
        long num7 = 3728299284L;
        System.out.println("Double to Int:" + (int) num3); // Double to Int:34
        System.out.println("float to short:" + (short) num2); // float to short:3
        System.out.println("long to Byte:" + (byte) num7); // long to Byte:20
        System.out.println("int to char:" + (char) num1); // int to char:d
    }
}
