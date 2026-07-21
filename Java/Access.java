public class Access {
    static int y;
    static String t = "hey";

    public static void m1() {
        System.out.println("Bye");
    }

    public static void m2() {
        System.out.println("Welcome");
    }

    public static void main(String[] args){
        // Accessing Static members
        // directly
        System.out.println(y); // 0
        System.out.println(t); // hey
        m1(); // Bye
        m2(); // Welcome

        // ClassName.memberName
        System.out.println(Access.y); // 0
        System.out.println(Access.t); // hey
        Access.m1(); // Bye
        Access.m2(); // Welcome

        // objectReference.memberName
        Access a = new Access();
        System.out.println(a.y); // 0
        System.out.println(a.t); // hey
        a.m1(); // Bye
        a.m2(); // Welcome

    }
}
