import java.util.Scanner;

public class DynamicReading {
    public static void demoDynamicReading(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        System.out.println("Enter the section");
        char section = sc.next().charAt(0);
        System.out.println(section);
    }
    public static void main(String[] args){
        // Adding the two program
        demoDynamicReading();
    }
}
