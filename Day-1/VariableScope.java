public class VariableScope {
    static boolean staticVariable; // Static variable (class-level)
    float instanceVariable;        // Instance variable (object-level)

    public static void main(String[] args) {
        final String finalVariable = "Hello"; // Final local variable
        VariableScope obj = new VariableScope();  // Creating object to access instance variable
        int localVariable = 2;            // Local variable inside main method

        {
            int blockVariable = 3;            // Block variable
            System.out.println("Block Variable: " + blockVariable);
        }

        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable (default): " + obj.instanceVariable);
        System.out.println("Final Variable: " + finalVariable);
        System.out.println("Static Variable (default) : " + staticVariable);
    }
}
