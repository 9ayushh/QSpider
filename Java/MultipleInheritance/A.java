class A extends D implements I1, I2 {
    
    @Override
    public void m1() {
        System.out.println("Done");
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();

        I1 i = new A();
        i.m1();

        I2 i2 = new A();
        i2.m1();
    }
}
