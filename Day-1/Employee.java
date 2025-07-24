public class Employee {
    int empId;
    String name;
    String department;
    double salary;

    public Employee() {
    }


    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(001, "Pankaj", "CSE", 25000.0);
        Employee emp2 = new Employee(002, "Harish", "DS", 15000.0);
        Employee emp3 = new Employee();
        System.out.println(emp1.empId + " " + emp1.name + " " + emp1.department + " " + emp1.salary);
        System.out.println(emp2.empId + " " + emp2.name + " " + emp2.department + " " + emp2.salary);
        System.out.println(emp3.empId + " " + emp3.name + " " + emp3.department + " " + emp3.salary);

    }
}
