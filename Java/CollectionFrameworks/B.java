import java.util.ArrayList;

public class B {
    public static void main(String[] args) {
        // ArrayList a = new ArrayList();
        // a.add("hey");
        // a.add(78);
        // a.add(true);

        // System.out.println(a);
        // System.out.println(a.size());

        ArrayList a1 = new ArrayList();
        a1.add(6.7);
        a1.add(23);
        a1.add("bye");
        a1.add('A');

        // a1.add(a);
        // System.out.println(a1); // [6.7, 23, bye, A, [hey, 78, true]]
        // System.out.println(a1.size()); // 5

        // a1.addAll(a);
        // System.out.println(a1); // [6.7, 23, bye, A, hey, 78, true]
        // System.out.println(a1.size()); // 7

        // a1.removeAll(a);
        // System.out.println(a1); //[6.7, 23, bye, A]

        // a1.retainAll(a); 
        // System.out.println(a1); // [hey, 78, true]

        Object [] arr = a1.toArray();
        // System.out.print(arr[0] + " ");
        // System.out.print(arr[1] + " ");
        // System.out.print(arr[2] + " ");
        // System.out.print(arr[3] + " ");

        for (Object i : arr) {
            System.out.println(i);
        }
    }
}
