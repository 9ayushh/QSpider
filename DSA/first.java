public class first {
    public static int fact(int num){
        if(num == 0){
            return 0;
        } else if(num == 1){
            return 1;
        } else {
            return num * fact(num-1);
        }
    }
    public static boolean strongNum(int num){
        int temp = num;
        int ans = 0;
        while(temp > 0){
            int x = temp % 10;
            ans += fact(x);
            temp = temp/10;
        }
        if(ans == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // Strong Numbers
        int num = 146;
        System.out.println(strongNum(num));
        // strongNum(num);
    }
}
