import java.util.ArrayList;
import java.util.List;

public class Conditional {
    public static int count(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static int power(int num, int count){
        int temp = 1;
        while(count > 0){
            temp *= num;
            count--;
        }
        return temp;
    }
    public static boolean armstrong(int num){
        int count = count(num);
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            int digit1 = temp % 10;
            sum += power(digit1, count);
            temp /= 10;
        }
        if (sum == num){
            return true;
        }
        return false;
    }

    public static List<Integer> nums(int m, int n){
        List<Integer> list = new ArrayList<>();
        for(int i = m; i<=n; i++){
            if(i>1 && i<=9) continue;
            boolean bool = armstrong(i);
            if(bool == true){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // System.out.println(armstrong(1633));
        System.out.println(nums(1, 1000));

        // looping

        // while loop
        // while(true) {
        //     System.out.println("hey");
        // }

        // do-while loop
        // int i = 0; // initializing the variable
        // do {
        //     System.out.println("hello");
        // } while(i++<5); // to convert it into finite

        // for loop
        // for(initialization/Declaration; condtional; increment/decrement/relational) {}
        // for( ; ;) {
        //     System.out.println("hey");
        // }

        // char ch = 'A';
        // while (ch < 100) {
        //     System.out.println(ch);
        //     ch += 2;
        // }

        // char n = 'A';
        // int i;
        // for(i=2; i<=16; i *=2){
        //     System.out.println(i + " " + n);
        // }

        // Armstrome no

        
    }
}
