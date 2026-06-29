public class ActivityOfOperators {
    public static void main(String[] args) {
        // 1. WAP to print the 53.5/2 and 53.5%2.
        float val1 = 53.5f;
        int num1 = 2;
        System.out.println(val1 / num1);
        System.out.println(val1 % num1);
        
        // 2. WAP to print the 54.0/2 and 54.0%2.
        float val2 = 54.0f;
        int num2 = 2;
        System.out.println(val2 / num2);
        System.out.println(val2 % num2);
        
        // 3. WAP to print the 97/2.0 and 97%2.0.
        int val3 = 97;
        float num3 = 2.0f;
        System.out.println(val3 / num3);
        System.out.println(val3 % num3);
        
        // 4. WAP to print the 32.0/2 and 32.0%2.0.
        float val4 = 32.0f;
        float num4 = 2.0f;
        int num = 2;
        System.out.println(val4 / num);
        System.out.println(val4 % num4);
        
        // 5. WAP to print the 38.0/2.5 and 38.0%2.5.
        float val5 = 32.0f;
        float num5 = 2.5f;
        System.out.println(val5 / num5);
        System.out.println(val5 % num5);
        
        // 6. 5371 % 10
        int digit1 = 5371;
        int modular1 = digit1 % 10;
        System.out.println(modular1);
        
        // 7. 5371 / 10
        int division1 = digit1 / 10;
        System.out.println(division1);
        
        // 8. 537 % 10
        int digit2 = 537;
        int modular2 = digit2 % 10;
        System.out.println(modular2);
        
        // 9. 537 / 10
        int division2 = digit2 / 10;
        System.out.println(division2);
        
        // 10. 53 % 10
        int digit3 = 53;
        int modular3 = digit3 % 10;
        System.out.println(modular3);
        
        // 11. 53 / 10
        int division3 = digit3 / 10;
        System.out.println(division3);
        
        // 12. 5 % 10
        int digit4 = 5;
        int modular4 = digit4 % 10;
        System.out.println(modular4);
        
        // 13. 5 / 10
        int division4 = digit4 / 10;
        System.out.println(division4);
        
        // 14. 5 % 0
        int digit5 = 5;
        int modular5 = digit5 % 0;
        System.out.println(modular5); // error
        
        // 15. 5 / 0
        int division5 = digit5 / 0;
        System.out.println(division5); // error
        
    }
}