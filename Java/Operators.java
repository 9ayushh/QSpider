public class Operators {
    public static void main(String[] args) {
        // WAP to add 2 number
        int num1 = 50;
        int num2 = 60;
        int sum = num1 + num2;
        System.out.println(sum);

        int n = 8;
        for(int i=1; i<(n/2+1); i++){
            if(n%i == 0){
                System.out.println(i);
            } 
        }
        System.out.println(n);
    }   
}
