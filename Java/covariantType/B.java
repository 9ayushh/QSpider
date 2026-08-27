package Java.covariantType;

public class B extends A {
    @Override
    public B m1(){
        B b = new B();
        System.out.println("helo");
        return b;
    }
    public static void main(String[] args){
        A a = new B();
        System.out.println(a.m1());
    }
}
