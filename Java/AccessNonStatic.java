public class AccessNonStatic {
    int y;
    String t = "hey";

    public void m1() {
        System.out.println("Bye");
    }

    public void m2() {
        System.out.println("Welcome");
    }

    public void mainNonStatic() {
        // Accessing Static members
        // directly
        System.out.println(y); // 0
        System.out.println(t); // hey
        m1(); // Bye
        m2(); // Welcome

        // objectReference.memberName
        AccessNonStatic a = new AccessNonStatic();
        System.out.println(a.y); // 0
        System.out.println(a.t); // hey
        a.m1(); // Bye
        a.m2(); // Welcome

        // by this.memberName and super.memberName
        System.out.println(this.y);
        this.m1();
        // System.out.println(super.y); // only used in child class

    }

    public static void mainStatic(){
        AccessNonStatic a = new AccessNonStatic();
        System.out.println(a.y); // 0
        System.out.println(a.t); // hey
        a.m1(); // Bye
        a.m2(); // Welcome
    }
    
    public static void main(String[] args){
        AccessNonStatic a = new AccessNonStatic();
        // a.mainNonStatic();

        // Access.m1(); // static method from another class -> wrong

    }
}
