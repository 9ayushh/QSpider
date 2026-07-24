public class ArrayDemo {
    public static void printArray(int[] a){
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        // // initialize & declaration
        // int[] a = {8,9,6,3};
        
        // // accessing
        // System.out.println(a); // reference
        // System.out.println(a.length); // 4
        // System.out.println(a.length - 1); // 3
        // System.out.println(a[2]); // 6
        // System.out.println(a[3]); // 3
        
        // // update
        // a[1] = 102;
        // System.out.println(a[1]); // 102
        
        // // ------------------------------
        
        // // declaration
        // int[] arr; // only declaration

        // arr = new int[6]; // initialize with size only
        
        // // Accessing 
        // System.out.println(arr); // reference
        // System.out.println(arr.length); // 2
        // System.out.println(arr[0]); // 0
        // System.out.println(arr[1]); // 0
        // // System.out.println(arr[2]); // Exception - Array Index Out of Bound
        // arr[0] = 46;
        // arr[1] = 45;
        
        // ---------------------------------
        int[] a = {5,4,9,7};
        printArray(a);
    }
}
