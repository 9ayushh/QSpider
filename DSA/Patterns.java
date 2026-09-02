class Patterns {
    public static void pattern1(int n){
        for(int i =1; i<=n; i++){
            int x = i;
            for(int j = 1; j<=i; j++){
                System.out.print(x + " ");
                x += n-j;
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<= n; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= i; j++){
                System.out.print(j);
            }
            for(int j=1; j<= i-1; j++){
                System.out.print(i-j);
            }
            System.out.println();
        }
    }
    
    public static void pattern3(int n) {
        for(int i=1; i<=n; i++){
            int x = i;
            for(int j=1; j<=i; j++){
                if(i%2 == 0){
                    System.out.print(j);
                }else {
                    System.out.print(i-j+1);
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // int n = 5;
        // pattern1(n);

        // n = 3;
        // pattern2(n);

        int n = 5;
        pattern3(n);
    }
}

// 1
// 21
// 123
// 4321
// 12345