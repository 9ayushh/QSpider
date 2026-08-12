public class PerfectNumber {
    static int fact(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return n * fact(n-1);
    }
    
    static int isPerfect(int N) {
        int temp = N;
        int sum = 0;
        // code here
        while(temp > 0){
            int num = fact(temp % 10);
            sum += num;
            temp /= 10;
        }
        if(sum == N) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int N = 40585;
        System.out.println(isPerfect(N));
        System.out.println(fact(5));
    }
}
