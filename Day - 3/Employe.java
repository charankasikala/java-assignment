public class Employe {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public Employe(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void displayEmployeeDetails() {
        System.out.println(String.format("%-10s %-15d %s", name, yearOfJoining, address));
    }
    public static void main(String[] args) {
        Employe emp1 = new Employe("Robert", 1994, 64.0, "64C- WallsStreat");
        Employe emp2 = new Employe("Sam", 2000, 68.0, "68D- WallsStreat");
        Employe emp3 = new Employe("John", 1999, 26.0, "26B- WallsStreat");
        System.out.println(String.format("%-10s %-15s %s", "Name", "YearOfJoining", "Address"));
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
    }
}

/* Output:
Name       YearOfJoining   Address
Robert     1994            64C- WallsStreat
Sam        2000            68D- WallsStreat
John       1999            26B- WallsStreat
 */