
public class Second {
    public static String rev(String s) {
        String rev = "";

        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        
        return rev.trim();
    }
    
    public static String reverseWords(String s) {
        // Code here
        String[] arr = s.split(" ");
        
        String ans = "";
        
        for(int i=0; i<arr.length; i++){
            String str = arr[i];
            if(str.isBlank()) {
                continue;
            }
            arr[i] = rev(str);
            
            ans = ans + arr[i] + " "; 
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "cb ipctpyru  bovcbo";
        // System.out.println(Arrays.toString(reverseWords(s)));
        System.out.println(reverseWords(s));
    }
}
