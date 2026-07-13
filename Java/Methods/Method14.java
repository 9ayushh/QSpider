public class Method14 {
    public static void print(){
        for(char i='a'; i<= 'z'; i++){
            if(i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u')
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // 13. WAJP to create a method which print all the even numbers from a to z
        print();
    }
}
