class Employee {
    // Class Members
    String empName;
    int empId;
    String empDepartment;

    // Construcor
    public Employee(String name, int id, String department) {
        empName = name;
        empId = id;
        empDepartment = department;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Department : " + empDepartment);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "HR");
        Employee emp2 = new Employee("Jane Smith", 102, "Finance");
        Employee emp3 = new Employee("Alice Johnson", 103, "IT");

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
