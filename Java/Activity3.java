import javax.security.auth.Subject;

public class Activity3 {
    public static void main(String[] args) {
        // 1. Print the factorial of 8
        int val1 = 8;
        int fact8 = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
        System.out.println(fact8);
        
        // 2. Print factorials of 7
        int val2 = 7;
        int fact7 = 7 * 6 * 5 * 4 * 3 * 2 * 1;
        System.out.println(fact7);
        
        // 3. Print factorials of 4
        int val3 = 4;
        int fact4 = 4 * 3 * 2 * 1;
        System.out.println(fact4);

        // 4. Find the Simple Interest where Principal amount is 8 lakhs, time 60 months, rate of interest is 12%.
        float principal = 800000f;
        float time = 60/12;
        float roi = 12;
        float simpleInterest = (principal * time * roi) / 100;
        System.out.println(simpleInterest);

        // 5. What is the average of following number: 40, 30, 56, 78
        int num1 = 40;
        int num2 = 30;
        int num3 = 56;
        int num4 = 78;
        int avg = (num1 + num2 + num3 + num4) / 4;
        System.out.println(avg);
        
        // 6. Find the mark and overall percentage of Ashish, where 
        //     mark in Science is 78
        //     mark in Social Science is 89
        //     mark in Math is 99
        //     mark in English is 88
        //     mark in Hindi is 67. Full mark of every individual Subject is 100
        float science = 78;
        float socialScience = 89;
        float math = 99;
        float english = 88;
        float hindi = 67;
        float marks = science + socialScience + math + english + hindi;
        float total = 100 * 5;
        float percentage =(marks * 100) / total;
        System.out.println(marks);
        System.out.println(percentage);

    }
}
