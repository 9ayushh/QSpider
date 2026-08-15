public class PalllindromNum {
    public static boolean isPalindrome(int n) {
        // code here
        int temp = n;
        int rev = 0;
        if(temp<0){
            temp *= -1;
            while(temp>0) {
                int num = temp % 10;
                rev = rev * 10 + num ;
                temp /= 10;
            }
            rev *= -1;
        } else {
            while(temp>0) {
                int num = temp % 10;
                rev = rev * 10 + num ;
                temp /= 10;
            }
        }

        
        return rev == n;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-6));
    }
}
