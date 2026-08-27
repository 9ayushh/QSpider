
public class StringClass {
    public static void main(String[] args) {
        System.out.println("hy");

        String s = "Bye";
        System.out.println(s); // Bye

        String s1 = new String("Bro");
        System.out.println(s1); // Bro

        // StringBuffer t = "Dev"; // CTE

        StringBuffer y = new StringBuffer("Dev"); 
        System.out.println(y); // Dev

        StringBuilder v = new StringBuilder("Java");
        System.out.println(v); // Java


        // String
        String s2 = "hy";
        s2 = s2.concat("helo");
        System.out.println(s2);

        // StringBuffer
        StringBuffer s3 = new StringBuffer("Hy");
        s3.append("helo");
        System.out.println(s3);

        // StringBuilder
        StringBuilder s4 = new StringBuilder("Hy");
        s4.append("helo");
        System.out.println(s4);
    }
}
