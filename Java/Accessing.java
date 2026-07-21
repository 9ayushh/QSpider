public class Accessing {
    int x;
    static int y;

    public void main1(){
        int z = 2;
        System.out.println(z);
        System.out.println("Hello");
    }

    public static void main2(){
        System.out.println("Hey");
    }

    public static void main(String[] args) {
        int p = 3;
        System.out.println(y);
        main2();
        // main1(); // error
        Accessing a = new Accessing();
        System.out.println(a);
        System.out.println(a.x);
        a.main1();
        // System.out.println(z); // error because of local variable
    }
}
