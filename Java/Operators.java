public class Operators {
    public static void main(String[] args) {
        // WAP to add 2 number
        int num1 = 50;
        int num2 = 60;
        int sum = num1 + num2;
        // System.out.println(sum);
            
        // Positive number
        int n1 = 1;
        System.out.println(n1 < 0 ? "Not positive number" :  "positive number");

        // Negative number
        int n2 = 1;
        System.out.println(n2 >= 0 ? "Not negative number" :  "negative number");
        
        // Zero or not
        int n3 = 1;
        System.out.println(n3 == 0 ? "Zero number" :  "non zero number");
        
        // Larger than 50 or not
        int n4 = 1;
        System.out.println(n4 > 50 ? "greater than 50" :  "not greater than 50");

        // price is more than 125.75 or not
        float n5 = 1;
        System.out.println(n5 > 125.5 ? "more than 125.75" :  "less than 125.75");

        // Number is inbetween 500 to 1000 or not excluding the given number
        int n6 = 1;
        System.out.println((n6 > 500 && n6 < 1000) ? "Number is inbetween 500 and 1000" :  "Number is not inbetween 500 and 1000");

        // Number is a 2 digit number or not
        int n7 = 1;
        System.out.println((n7 > 9 && n7 < 100) ? "Number is a 2 digit number" :  "Number is not a 2 digit number");

        // Number is divisible by 5 or not
        int n8 = 1;
        System.out.println(n8 % 5 == 0 ? "Divisible by 5" :  "not divisible by 5");
        
        // Number is divisible by 7 or not
        int n9 = 1;
        System.out.println(n9 % 7 == 0 ? "Divisible by 7" :  "not divisible by 7");

        // Number is even or not
        int n10 = 1;
        System.out.println(n10 % 2 == 0 ? "Even number" :  "not an even number");

        // Number is odd or not
        int n11 = 1;
        System.out.println(n11 % 2 != 0 ? "Odd number" :  "not a odd number");

        // Number is divisible by 6 or not without directly dividing or modulus by 6
        int n12 = 1;
        System.out.println((n12 % 2 == 0 && n12 % 3 == 0) ? "divisible by 6" : "not divisible by 6");

        // Number is even or not without using modulus operator
        int n13 = 1;
        System.out.println((n13/2) * 2 == n13 ? "Even number" : "Odd number");

        // Given character is 'A'/'a' or not
        char ch1 = 'a';
        String res1 = (ch1 == 'a' || ch1 == 'A') ? "It is a 'a' or 'A'" : "It is not 'a' or 'A'";
        System.out.println(res1);
        
        // Given character is 'Q'/'q' or not
        char ch2 = 'a';
        String res2 = (ch2 == 'Q' || ch2 == 'q') ? "It is a 'Q' or 'q'" : "It is not 'Q' or 'q'";
        System.out.println(res2);
        
        // Given character is uppercase character or not
        char ch3 = 'a';
        String res3 = (ch3 >= 'A' && ch3 <= 'Z') ? "It is an uppercase character" : "It is not an uppercase character";
        System.out.println(res3);
    
        // Given character is lowercase character or not
        char ch4 = 'a';
        String res4 = (ch4 >= 'a' && ch4 <= 'z') ? "It is an lowercase character" : "It is not an lowercase character";
        System.out.println(res4);

        // Given character is lowercase character or not
        char ch5 = 'a';
        String res5 = ((ch5 >= 'a' && ch5 <= 'z')||(ch5 >= 'A' && ch5 <= 'Z')) ? "It is an alphabet" : "It is not an alphabet";
        System.out.println(res5);
        
        // Given character is digit character or not
        char ch6 = '9';
        String res6 = ((ch6 >= '0' && ch6 <= '9')) ? "It is a digit" : "It is not a digit";
        System.out.println(res6);
        
        // Given character is uppercase vowel or not
        char ch7 = 'a';
        String res7 = ((ch7 == 'A' || ch7 == 'E' || ch7 == 'I' || ch7 == 'O' || ch7 == 'U')) ? "It is an uppercase vowel" : "It is not an uppercase vowel";
        System.out.println(res7);

        // Given character is lowercase vowel or not
        char ch8 = 'a';
        String res8 = ((ch8 == 'a' || ch8 == 'e' || ch8 == 'i' || ch8 == 'o' || ch8 == 'u')) ? "It is a lowercase vowel" : "It is not a lowercase vowel";
        System.out.println(res8);
        
        // Given character is vowel or not
        char ch9 = 'a';
        String res9 = ((ch9 == 'a' || ch9 == 'e' || ch9 == 'i' || ch9 == 'o' || ch9 == 'u' || ch9 == 'A' || ch9 == 'E' || ch9 == 'I' || ch9 == 'O' || ch9 == 'U')) ? "It is a lowercase vowel" : "It is not a lowercase vowel";
        System.out.println(res9);
        
        // Given character is uppercase consonent or not
        char ch10 = 'a';
        String res10 = (ch10 >= 'A' && ch10 <= 'Z') && (ch10 != 'A' || ch10 != 'E' || ch10 != 'I' || ch10 != 'O' || ch10 != 'U') ? "It is an uppercase consonent" : "It is not an uppercase consonent";
        System.out.println(res10);
        
        // Given character is lowercase consonent or not
        char ch11 = 'a';
        String res11 = (ch11 >= 'a' && ch11 <= 'z') && (ch11 != 'a' || ch11 != 'e' || ch11 != 'i' || ch11 != 'o' || ch11 != 'u') ? "It is a lowercase consonent" : "It is not a lowercase consonent";
        System.out.println(res11);

        // Find the person is eligible to vote or not
        int age = 8;
        System.out.println(age >= 18 ? "Eligible to vote" : "Not Eligible for vote");

        // Find the largest among three number
        int val1 = 9, val2 = 100, val3 = 10;
        boolean con1 = (val1 > val2 && val1 > val3);
        boolean con2 = (val2 > val1 && val2 > val3);
        String largest = con1 ? val1 + " is largest" : (con2 ? val2 + " is largest" : val3 + " is largest");
        System.out.println(largest);
        
        // Find the smallest among three number
        // int val1 = 9, val2 = 100, val3 = 10;
        boolean sCon1 = (val1 < val2 && val1 < val3);
        boolean sCon2 = (val2 < val1 && val2 < val3);
        String smallest = sCon1 ? val1 + " is smallest" : (sCon2 ? val2 + " is smallest" : val3 + " is smallest");
        System.out.println(smallest);
        
        // Find the largest among three number without using AND operator
        int a = 3, b = 8, c = 7; 
        boolean cond1 = (a > b);
        boolean cond2 = (a > c);
        boolean cond3 = (b > c);

        int lar = cond1 ? (cond2 ? a : c) : (cond3 ? b : c);

        System.out.println(lar);
        
        // Find the smallest among three number without using AND operator
        boolean scond1 = (a < b);
        boolean scond2 = (a < c);
        boolean scond3 = (b < c);

        int small = scond1 ? (scond2 ? a : c) : (scond3 ? b : c);

        System.out.println(small);


    }   
}
