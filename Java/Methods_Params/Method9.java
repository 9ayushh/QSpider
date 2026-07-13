public class Method9 {
    public static void print(int m, int n){
        for(int i=m; i<= n; i++){
            if(i%2==0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // WAJP to create a method which print all the even numbers from 250 to 470
        print(250, 470);
    }
}
