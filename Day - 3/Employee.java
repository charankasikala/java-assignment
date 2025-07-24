public class Employee {
    String emp_name;
    int emp_id;
    String emp_designation;
    double emp_salary;
    public Employee(){
        System.out.println("Object has been created");
    }
    public Employee(String emp_name, int emp_id, String emp_designation, double emp_salary){
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.emp_designation = emp_designation;
        this.emp_salary = emp_salary;
    }
    public Employee(Employee emp){
        this.emp_name = emp.emp_name;
        this.emp_id = emp.emp_id;
        this.emp_designation = emp.emp_designation;
        this.emp_salary = emp.emp_salary;
    }
    public void display_details(){
        System.out.println("Name: " + emp_name);
        System.out.println("ID: " + emp_id);
        System.out.println("Designation: " + emp_designation);
        System.out.println("Salary: " + emp_salary);
		System.out.println();
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Kasim", 101, "Manager", 100000);
        Employee emp3 = new Employee(emp2);
        emp1.display_details();
        emp2.display_details();
        emp3.display_details();

    }
}

/* Output:
Object has been created
Name: null
ID: 0
Designation: null
Salary: 0.0

Name: Kasim
ID: 101
Designation: Manager
Salary: 100000.0

Name: Kasim
ID: 101
Designation: Manager
Salary: 100000.0
*/

