public class Method {
    private static int a = 0;
    private static void prog(){
        System.out.println("heelo");
        a = 5;
        System.out.println(a);
    }
    private static void test() {
        a = 9;
        System.out.println(a);
    }
    // non-static initializer
    {
        System.out.println("heelo");
    }
    static // static initializer
    {
        System.out.println("hola");
    }
    public static void main(String[] args) {
        // System.out.println(a);
        // test();
        // prog();

    }

}
