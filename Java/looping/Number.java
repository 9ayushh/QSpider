public class Number {
    public static void main(String[] args) {

        int num = 525;
        double price = 130.50;
        int age = 20;

        // Q1: Positive or not positive
        if (num > 0) {
            System.out.println("Positive");
        }
        if (num <= 0) {
            System.out.println("Not Positive");
        }

        // Q2: Negative or not negative
        if (num < 0) {
            System.out.println("Negative");
        }
        if (num >= 0) {
            System.out.println("Not Negative");
        }

        // Q3: Zero or non-zero
        if (num == 0) {
            System.out.println("Zero");
        }
        if (num != 0) {
            System.out.println("Non-Zero");
        }

        // Q4: Larger than 50 or not
        if (num > 50) {
            System.out.println("Larger than 50");
        }
        if (num <= 50) {
            System.out.println("Not Larger than 50");
        }

        // Q5: Price more than 125.75 or not
        if (price > 125.75) {
            System.out.println("Price is more than 125.75");
        }
        if (price <= 125.75) {
            System.out.println("Price is not more than 125.75");
        }

        // Q6: Between 500 and 1000 (excluding 500 and 1000)
        if (num > 500 && num < 1000) {
            System.out.println("Between 500 and 1000");
        }
        if (!(num > 500 && num < 1000)) {
            System.out.println("Not Between 500 and 1000");
        }

        // Q7: Two-digit number or not
        if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) {
            System.out.println("Two Digit Number");
        }
        if (!((num >= 10 && num <= 99) || (num <= -10 && num >= -99))) {
            System.out.println("Not a Two Digit Number");
        }

        // Q8: Divisible by 5 or not
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        if (num % 5 != 0) {
            System.out.println("Not Divisible by 5");
        }

        // Q9: Divisible by 7 or not
        if (num % 7 == 0) {
            System.out.println("Divisible by 7");
        }
        if (num % 7 != 0) {
            System.out.println("Not Divisible by 7");
        }

        // Q10: Even or not
        if (num % 2 == 0) {
            System.out.println("Even");
        }
        if (num % 2 != 0) {
            System.out.println("Not Even");
        }

        // Q11: Odd or not
        if (num % 2 != 0) {
            System.out.println("Odd");
        }
        if (num % 2 == 0) {
            System.out.println("Not Odd");
        }

        // Q12: Divisible by 6 without directly using %6 or /6
        if ((num % 2 == 0) && (num % 3 == 0)) {
            System.out.println("Divisible by 6");
        }
        if (!((num % 2 == 0) && (num % 3 == 0))) {
            System.out.println("Not Divisible by 6");
        }

        // Q13: Even without modulus operator
        if ((num / 2) * 2 == num) {
            System.out.println("Even");
        }
        if ((num / 2) * 2 != num) {
            System.out.println("Not Even");
        }

        // Q25: Eligible to vote or not
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        }
        if (age < 18) {
            System.out.println("Not Eligible to Vote");
        }
    }
}