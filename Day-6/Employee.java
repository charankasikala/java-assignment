public class Employee {
    private int employeeID;
    private String name;
    private String designation;
    private String department;
    private double monthlySalary;

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setMonthlySalary(double monthlySalary)	{
		if(monthlySalary >= 0){
			this.monthlySalary = monthlySalary;
		}
		else{
			System.out.println("Invalid Amount !");
		}
        
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public double getAnnualSalary() {
        return monthlySalary * 12;
    }
	
	public void displayEmployeeDetails(){
		System.out.println("Displaying Employee Info:");
		System.out.println("Employee ID:" + getEmployeeID());
        System.out.println("Employee Name:" + getName());
        System.out.println("Employee Designation:" +getDesignation());
        System.out.println("Employee Department:" +getDepartment());
        System.out.println("Employee Monthly Salary:" +getMonthlySalary());
        System.out.println("Employee Annual Salary:" +getAnnualSalary());
		System.out.println();
	}

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeID(101);
        employee.setName("Kasik");
        employee.setDesignation("Software Engineer");
        employee.setDepartment("IT");
        employee.setMonthlySalary(100000);
		employee.displayEmployeeDetails();
		employee.setName("CHARAN KUMAR KASIKALA");
		System.out.println("Updated Name: " +employee.getName());
    }
}