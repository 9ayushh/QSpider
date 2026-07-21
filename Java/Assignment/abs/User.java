public class User {
    int userId;
    String name;
    int partnershipYear;
    double amount;
    static String companyName;
    static String companyAdd;
    static long companyPhoneNo;
    long phNo;
    char userSection;
    String interest;

    public static void viewCompanyDetails() {
        System.out.println(companyName);
        System.out.println(companyAdd);
        System.out.println(companyPhoneNo);
    }

    public void userDetails() {

        System.out.println(userId);
        System.out.println(name);
        System.out.println(partnershipYear);
        System.out.println(amount);
        System.out.println(phNo);
        System.out.println(userSection);
        System.out.println(interest);
    }

    public User(){
        System.out.println("Constructor Created1");
    }
    public User(int a){
        System.out.println(a);
    }
    public User(String s){
        System.out.println(s);
    }
    public User(int a, int b){
        System.out.println(a+b);
    }
    public User(boolean x){
        System.out.println(x);
    }


    public static void main(String[] args){
        new User();

        System.out.println(new User(6));

        User ref = new User("hello");

        viewCompanyDetails();
        ref.userDetails();
        
    }
}
