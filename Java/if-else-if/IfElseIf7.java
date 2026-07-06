public class IfElseIf7 {
  public static void main(String[] args) {
    char ch = 'i';
    if(ch >= 'A' && ch <= 'Z'){
      System.out.println(ch+=32);
    }
    else if(ch >= 'a' && ch <= 'z'){
      System.out.println(ch-=32);
    }
    else{
      System.out.println("The character is either digit or special character");
    }
  }
}
