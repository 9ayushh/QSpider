public class ArraysDSA {
    public static void printing(){
        String[] a = new String[5];
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        
        byte[] b = new byte[5];
        // System.out.println(b[0]);
        // System.out.println(b[1]);
        // System.out.println(b[2]);
        // System.out.println(b[3]);
        // System.out.println(b[4]);
        for(int i=0; i<b.length; i++) {
            System.out.println(b[i]);
        }
        
        
        short[] c = new short[5];
        // System.out.println(c[0]);
        // System.out.println(c[1]);
        // System.out.println(c[2]);
        // System.out.println(c[3]);
        // System.out.println(c[4]);
        for(int i=0; i<c.length; i++) {
            System.out.println(c[i]);
        }
        
        
        int[] d = new int[5];
        // System.out.println(d[0]);
        // System.out.println(d[1]);
        // System.out.println(d[2]);
        // System.out.println(d[3]);
        // System.out.println(d[4]);
        for(int i=0; i<d.length; i++) {
            System.out.println(d[i]);
        }
        
        
        long[] e = new long[5];
        // System.out.println(e[0]);
        // System.out.println(e[1]);
        // System.out.println(e[2]);
        // System.out.println(e[3]);
        // System.out.println(e[4]);
        for(int i=0; i<e.length; i++) {
            System.out.println(e[i]);
        }
        
        
        float[] f = new float[5];
        // System.out.println(f[0]);
        // System.out.println(f[1]);
        // System.out.println(f[2]);
        // System.out.println(f[3]);
        // System.out.println(f[4]);
        for(int i=0; i<f.length; i++) {
            System.out.println(f[i]);
        }
        
        
        double[] g = new double[5];
        // System.out.println(g[0]);
        // System.out.println(g[1]);
        // System.out.println(g[2]);
        // System.out.println(g[3]);
        // System.out.println(g[4]);
        for(int i=0; i<g.length; i++) {
            System.out.println(g[i]);
        }
        
        
        char[] h = new char[5];
        // System.out.println(h[0]);
        // System.out.println(h[1]);
        // System.out.println(h[2]);
        // System.out.println(h[3]);
        // System.out.println(h[4]);
        for(int i=0; i<h.length; i++) {
            System.out.println(h[i]);
        }
        
        
        boolean[] i = new boolean[5];
        // System.out.println(i[0]);
        // System.out.println(i[1]);
        // System.out.println(i[2]);
        // System.out.println(i[3]);
        // System.out.println(i[4]);
        for(int j=0; j<i.length; j++) {
            System.out.println(i[j]);
        }

    }
    
    public static void arr1(){
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    
    public static int maxElement(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    
    public static int minElement(int[] arr) {
        int min = arr[0];
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public static int getSecondLargest(int[] arr) {
        // code here
        int max = arr[0];
        int max2 = -1;
        for(int i : arr){
            if(i > max){
                max2 = max;
                max = i;
            } else if(i > max2 && i< max){
                max2 = i;
            }
        }
        return max2;
    }
    
    public static void main(String[] args) {
        // arr1();

        // find the maximum element
        // int[] arr = {4,5,6,1,5,2};
        // System.out.println(maxElement(arr));

        // 1. sum of elements of array
        // 2. first part of array
        // 3. second part of array
        // 4. reverse the array
        // 5. copy from one array and paste to another array
    }
}
