public class Accessing {
    int x= 8;
    static int y = 5;

    public void main1(){
        int z = 2;
        System.out.println(z);
        System.out.println("Hello");
    }

    public static void main2(){
        System.out.println("Hey");
    }

    public static void m(){
        // int p = 3;
        // System.out.println(x); // error
        System.out.println(y);
        main2();
        // main1(); // error
        Accessing a = new Accessing();
        System.out.println(a);

        System.out.println(a.x);
        a.main1();
        // System.out.println(z); // error because of local variable

    }

    public static void main(String[] args) {
       // m();

       int y = 8;
       System.out.println(y); // 8
       System.out.println(Accessing.y); // 5

       Accessing.y = 9; // reinitialize
       System.out.println(Accessing.y); // 9

    }
}
