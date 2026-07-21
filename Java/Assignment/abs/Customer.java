abstract class xyz {
    abstract void meth();
}

public class Customer {
    int studId;
    String name;
    int yop;
    double percentage;
    static String clgName;
    static String clgAdd;
    long phNo;
    char section;
    static long clgPh;
    String degree;

    public static void viewBranchDetails() {
        System.out.println(clgName);
        System.out.println(clgAdd);
        System.out.println(clgPh);
    }

    public void customerDetails() {

        System.out.println(studId);
        System.out.println(name);
        System.out.println(yop);
        System.out.println(percentage);
        System.out.println(phNo);
        System.out.println(section);
        System.out.println(degree);
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
    }
}
