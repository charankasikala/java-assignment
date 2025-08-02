class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double calculateSalary() {
        return 0.0;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Type: Full-Time");
        System.out.println("Monthly Salary: Rs. " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Type: Part-Time");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: Rs. " + hourlyRate);
        System.out.println("Total Salary: Rs. " + calculateSalary());
        System.out.println("===============================");
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Harish", 101, 50000);
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Pankaj", 102, 400, 40);
        System.out.println("===============================");
        System.out.println("Full-Time Employee");
        fullTimeEmp.displayDetails();
        System.out.println("===============================");
        System.out.println("Part-Time Employee");
        partTimeEmp.displayDetails();
    }
}
