class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0 || salary > 1000000) {
            System.out.println("Invalid salary!");
        } else {
            this.salary = salary;
        }
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmployeeId(101);
        e.setEmployeeName("Priya");

        e.setSalary(50000);
        e.displayDetails();

        e.setSalary(-500);
        e.setSalary(1500000);

        System.out.println("Final salary: " + e.getSalary());
    }
}