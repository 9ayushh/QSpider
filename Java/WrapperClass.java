public class WrapperClass {
    public static void main(String[] args){
        int a = 8;
        System.out.println(a);

        Integer i = new Integer(5); // boxing
        System.out.println(i);
         
        Integer u = 3; // autoboxing
        System.out.println(u);

        int y = u; // auto unboxing
        System.out.println(y);

        String s = "hy";
    }
}
