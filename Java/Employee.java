public class Employee {
    public static void main(String[] args) {
        System.out.println("Employee Variable Declaration/Initialization/Accessing");
        int empid;
        String empName;
        String branch;
        char group;
        int empSalary;

        // Initialization
        empid = 101;
        empName = "Harsh";
        branch = "Developer";
        group = 'A';
        empSalary = 12345;

        // Accessing the variables
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Branch: " + branch);
        System.out.println("Employee Group: " + group);
        System.out.println("Employee Salary: " + empSalary);

    }
}
