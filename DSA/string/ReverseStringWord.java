
class ReverseStringWord {

    public static String rev(String s, int val) {
        String[] arr = s.split(" ");

        String str = arr[val];
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

        arr[val] = rev;

        rev = "";

        for(int i=0; i<arr.length; i++){
            rev = rev + arr[i] + " "; 
        }

        return rev;
    }
    public static void main(String[] args) {
        String s = "Java is a programming language";
        System.out.println(rev(s, 3));
    }
}