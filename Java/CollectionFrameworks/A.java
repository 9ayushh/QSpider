import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class A {
    public static void main(String[] args) {
        HashMap h = new HashMap();

        h.put(101, "Rahul"); // entry
        h.put(102, "Raj");
        h.put(103, "Kajal");
        h.put('A', true);
        h.put(null, null);
        h.put("bye", 5.6);

        System.out.println(h.isEmpty());
        System.out.println(h.size());
        System.out.println(h);

        h.put(103, 'm'); // update
        System.out.println(h);

        // only want values
        System.out.println(h.values()); // return type -> collection
        Collection res1 = h.values();
        System.out.println(res1 + "hey");

        // only want keys
        System.out.println(h.keySet()); // return type -> set
        Set res2 = h.keySet();
        System.out.println(res2);

        h.remove(103);
        System.out.println(h.containsKey(103));
        System.out.println(h.containsKey(102));

        System.out.println(h.containsValue("Rahul"));
        System.out.println(h.containsValue("bye"));

        h.clear();
        System.out.println(h); // set
        System.out.println(h.entrySet()); // array
    }
}
