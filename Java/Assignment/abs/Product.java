public class Product {
    int prodId;
    String name;
    int manufactureYear;
    double price;
    static String brandName;
    static String branchAddress;
    static long branchPhoneNo;
    long prodQR;
    char section;
    String dateOfExpire;

    public static void viewBranchDetails() {
        System.out.println(brandName);
        System.out.println(branchAddress);
        System.out.println(branchPhoneNo);
    }

    public void prodDetails() {

        System.out.println(prodId);
        System.out.println(name);
        System.out.println(manufactureYear);
        System.out.println(price);
        System.out.println(prodQR);
        System.out.println(section);
        System.out.println(dateOfExpire);
    }

    public Product(){
        System.out.println("Constructor Created1");
    }
    public Product(int a){
        System.out.println(a);
    }
    public Product(String s){
        System.out.println(s);
    }
    public Product(int a, int b){
        System.out.println(a+b);
    }
    public Product(boolean x){
        System.out.println(x);
    }


    public static void main(String[] args){
        new Product();

        System.out.println(new Product(6));

        Product ref = new Product("hello");

        viewBranchDetails();

        ref.prodDetails();
        
    }
}
