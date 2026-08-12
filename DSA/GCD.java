public class GCD {
    public static int hcf(int a, int b){
        int x = Math.max(a, b);
        int y = Math.min(a,b);
        if(x%y == 0){
            return y;
        }
        return hcf(y, x%y);
    }
    public static void main(String[] args) {
        int a = 18;
        int b = 12;

        System.out.println(hcf(a,b));

        
        // int gcd = 1;
        // for(int i = Math.min(a, b); i> 1; i--) {
        //     if(a%i == 0 && b%i == 0) {
        //         gcd = i;
        //         break;
        //     }
        // }
        // System.out.println();


    }
}
