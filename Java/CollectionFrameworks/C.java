
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;


public class C {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "val1");
        map.put(2, "val2");
        map.put(3, "val3");
        map.put(4, "val4");

        System.out.println(map);
        
        for(Integer i : map.keySet()){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        for(String val : map.values()) {
            System.out.print(val + " ");
        }
        
        System.out.println();
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        int a[] = {1,4,2,9,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.addAll(list);
        System.out.println(set);

        Vector v = new Vector<>();
        v.add(5);
        System.out.println(v);

        // Hashtable h = new Hashtable<>();
        // h.put(1,"7");
        // h.put(2, "aa");
        // System.out.println(h);
    }
}
