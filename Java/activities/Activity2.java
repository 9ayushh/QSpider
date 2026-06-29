public class Activity2 {
    public static void main(String[] args) {
        // 1. Print all the digits of a number 
        int num1 = 123;
        int digit1 = num1 % 10;
        int digit2 = (num1/10) % 10;
        int digit3 = (num1/100) % 10;
        System.out.println("Digit 1 - " + digit1);
        System.out.println("Digit 2 - " + digit2);
        System.out.println("Digit 3 - " + digit3);
        
        // 2. Print Sum of all the digits of a number
        int num2 = 987;
        int dig1 = num2 % 10;
        int dig2 = (num2/10) % 10;
        int dig3 = (num2/100) % 10;
        int sumOfDigit = dig1 + dig2 + dig3;
        System.out.println("Sum of Digits - " + sumOfDigit);
        
        // 3. Print product of all the digits of a number
        int prodOfDigit = dig1 * dig2 * dig3;
        System.out.println("Product of Digits - " + prodOfDigit);
        
        // 4. Print the sum of all the even digits of a number
        int num3 = 235;
        int evenDig1 = (num3/10) % 10;
        int sumOfEvenDig = evenDig1;
        System.out.println("Sum of Even Digits - " + sumOfEvenDig);
        
        // 5. Print the sum of all the odd digits of a number
        int oddDig1 = num3 % 10;
        int oddDig2 = (num3/100) % 10;
        int prodOfOddDigit = oddDig1 + oddDig2;
        System.out.println("Product of Odd Digits - " + prodOfOddDigit);
        
        // 6. Print the sum of prime digits of a number
        int num4 = 278;
        int digVal1 = num4 % 10;
        int digVal2 = (num4/10) % 10;
        int digVal3 = (num4/100) % 10; // not prime
        int primeSum = digVal1 + digVal2;
        System.out.println("Sum of Prime Digits - " + primeSum);

        // 7. Find Square of a number (sqr of 4, sqr of 7, sqr of 9)
        int val1 = 4;
        int sqrOf4 = val1 * val1;
        System.out.println(sqrOf4);
        
        int val2 = 7;
        int sqrOf7 = val2 * val2;
        System.out.println(sqrOf7);

        int val3 = 9;
        int sqrOf9 = val3 * val3;
        System.out.println(sqrOf9);
        
        // 8. Find the cube of a number(Cube of 5, Cube of 2, Cube of 15)
        int cubeOf5 = 5 * 5 * 5;
        System.out.println(cubeOf5);

        int cubeOf2 = 2 * 2 * 2;
        System.out.println(cubeOf2);

        int cubeOf15 = 15 * 15 * 15;
        System.out.println(cubeOf15);
        
        // 9. Find the 4th power of 5
        int powVal1 = 5;
        int forthPower = powVal1 * powVal1 * powVal1 * powVal1;
        System.out.println(forthPower);
        
        // 10. Find the 6th power of 3
        int powVal2 = 3;
        int sixthPower = powVal2 * powVal2 * powVal2 * powVal2 * powVal2 * powVal2;
        System.out.println(sixthPower);
        
        // 11. Find the 2nd power of 6
        int powVal3 = 6;
        int secondPower = powVal3 * powVal3;
        System.out.println(secondPower);
        
        // 12. Find the 3rd power of 8
        int powVal4 = 8;
        int thirdPower = powVal4 * powVal4 * powVal4;
        System.out.println(thirdPower);

        // 13. Area of rectangle where length is 4 cm and width is 5.6 cm
        float length = 4f;
        float width = 5.6f;
        float areaOfRectangle = length * width;
        System.out.println(areaOfRectangle);
        
        // 14. Perimeter of Rectangle where length is 4.1 cm with width is 3.2 cm
        float l = 4.1f;
        float w = 3.2f;
        float perimeter = 2 * (l + w);
        System.out.println(perimeter);
        
        // 15. Area and Perimeter of a square where side is 6 cm
        float side = 6f;
        float areaOfSquare = side * side;
        float PerimeterOfSquare = 4 * side;
        System.out.println(areaOfSquare);
        System.out.println(PerimeterOfSquare);
        
    }
}
