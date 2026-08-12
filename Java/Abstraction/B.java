public class B extends A {
    public void m1() {
        System.out.println("hey");
    }

    public static void main(String[] args) {
        B b = new B();
        b.m1();

        // A a = new A();
        A a = new B();
        a.m1();
    }
}
