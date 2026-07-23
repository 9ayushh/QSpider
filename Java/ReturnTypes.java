public class ReturnTypes {
    public static void main(String[] args) {
        // m1(); // doesn't return anything...
        // System.out.println(m1()); // use only 1 type
        // int val = m1();
        // System.out.println(val);


    }
    public static int m1() {
        System.out.println(5);
        return 3;
    }

    public static ReturnTypes m2(){
        ReturnTypes a = new ReturnTypes();
        return a;
    }
}
