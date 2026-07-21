public class Employee {
    int empId;
    String name;
    int yearOfJoining;
    double salary;
    static String companyName;
    static String companyAdd;
    static long companyPhoneNo;
    long phNo;
    char department;
    String deptName;

    public static void viewCompanyDetails() {
        System.out.println(companyName);
        System.out.println(companyAdd);
        System.out.println(companyPhoneNo);
    }

    public void empDetails() {

        System.out.println(empId);
        System.out.println(name);
        System.out.println(yearOfJoining);
        System.out.println(salary);
        System.out.println(phNo);
        System.out.println(department);
        System.out.println(deptName);
    }
    public Employee(){
        System.out.println("Constructor Created1");
    }
    public Employee(int a){
        System.out.println(a);
    }
    public Employee(String s){
        System.out.println(s);
    }
    public Employee(int a, int b){
        System.out.println(a+b);
    }
    public Employee(boolean x){
        System.out.println(x);
    }


    public static void main(String[] args){
        new Employee();

        System.out.println(new Employee(6));

        Employee ref = new Employee("hello");

        viewCompanyDetails();
        ref.empDetails();

        
    }
}
