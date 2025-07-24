public class BlockExecution {
    static {
        System.out.println("Static Block Executed"); // Static Block Executed
    }

    {
        System.out.println("Initializer Block Executed"); // Initializer Block Executed
    }
    public static void main(String[] args) {
        System.out.println("Main Executed"); // Main Executed
        BlockExecution obj1 = new BlockExecution(); // Initializer Block Executed
        BlockExecution obj2 = new BlockExecution(); //Initializer Block Executed
    }
}