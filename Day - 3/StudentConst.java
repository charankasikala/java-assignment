public class StudentConst {
    String name;
    int roll_no;
    int phone_no;
    String address;

    public StudentConst(String name, int roll_no, int phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }
    public static void main(String[] args) {
        StudentConst stu1 = new StudentConst("Sam", 1, 987654321, "Guntur");
        StudentConst stu2 = new StudentConst("John", 2, 874455555, "Hyderabad");
        System.out.println("Student Details");
        System.out.println("Name: " + stu1.name + "\tRoll No: " + stu1.roll_no + "\tPhone No: " + stu1.phone_no + "\tAddress: " + stu1.address);
        System.out.println("Name: " + stu2.name + "\tRoll No: " + stu2.roll_no + "\tPhone No: " + stu2.phone_no + "\tAddress: " + stu2.address);

    }
}

/* Output:
Student Details
Name: Sam       Roll No: 1      Phone No: 987654321     Address: Guntur
Name: John      Roll No: 2      Phone No: 874455555     Address: Hyderabad

*/

