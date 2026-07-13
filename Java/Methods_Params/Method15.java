public class Method15 {
    public static void print(){
        for(char i='A'; i<= 'Z'; i++){
            if(i != 'A' && i != 'E' && i != 'I' && i != 'O' && i != 'U')
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // 15. WAJP to create a method which print all uppercase consonents
        print();
    }
}
