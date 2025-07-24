public class Student {
    String name;
    int roll_no;
    
    public static void main(String[] args) {
        Student stuObj = new Student();
		stuObj.name = "John";
		stuObj.roll_no = 2;
        System.out.println("Sudent Name: " + stuObj.name + "\nRoll No: " + stuObj.roll_no);
    }
}