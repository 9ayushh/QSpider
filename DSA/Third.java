public class Third {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for(int i = 11; i <= 51; i = i+10){
            for(int j = i; j< i+5; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
