
interface First {
    void m1();

    public final static int x = 9;
    // by default public
    // by default final
    // by default static

    // int u; // CTE - error (cannot declared only)
    
    public static void main(String[] args) {
        System.out.println(x);
    }
}
