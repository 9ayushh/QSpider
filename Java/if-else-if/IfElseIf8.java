public class IfElseIf8 {
  public static void main(String[] args) {
    char ch = '*';
    if(ch >= 'A' && ch <='Z'){
      System.out.println("The character is uppercase");
    }
    else if(ch >= 'a' && ch <= 'z'){
      System.out.println("The character is lowercase");
    }
    else if(ch >= '0' && ch <= '9'){
      System.out.println("The character is digit character");
    }
    else{
      System.out.println("The character is special character");
    }
  }
}
