abstract class xyz {
    abstract void meth();
}

public class Customer {
    int custId;
    String name;
    int yearOfJoining;
    double amount;
    static String branchName;
    static String branchAdd;
    static long branchPh;
    long phNo;
    char deptSection;
    String dept;

    public static void viewBranchDetails() {
        System.out.println(branchName);
        System.out.println(branchAdd);
        System.out.println(branchPh);
    }

    public void customerDetails() {

        System.out.println(custId);
        System.out.println(name);
        System.out.println(yearOfJoining);
        System.out.println(amount);
        System.out.println(phNo);
        System.out.println(deptSection);
        System.out.println(dept);
    }

    public Customer(){
        System.out.println("Constructor Created1");
    }
    public Customer(int a){
        System.out.println(a);
    }
    public Customer(String s){
        System.out.println(s);
    }
    public Customer(int a, int b){
        System.out.println(a+b);
    }
    public Customer(boolean x){
        System.out.println(x);
    }


    public static void main(String[] args){
        new Customer();

        System.out.println(new Customer(6));

        Customer ref = new Customer("hello");

        viewBranchDetails();

        ref.customerDetails();
    }
}
