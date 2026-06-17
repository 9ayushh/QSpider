public class Second {
    public static int digit(int num){
        int cout = 0;
        while(num > 0){
            cout++;
            num = num/10;
        }
        return cout;
    }
    public static int cube(int num, int k){
        int x = 1;
        for(int i = 0; i< k; i++){
            x = x * num;
        }
        return x;
    }
    public static boolean armstrongNumber(int n) {
        int ans = 0;
        int temp = n;
        int k = digit(n);
        while(temp>0){
            int x = temp % 10;
            ans += cube(x, k);
            temp = temp/10;
        }
        if(ans == n){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        // Armstrong Number
        int num = 153;
        for(int i=1; i<10001; i++) {
            if(armstrongNumber(i) == true) {
                System.out.println(i);
            }
        }
        System.out.println(armstrongNumber(num));
    }
    
}
