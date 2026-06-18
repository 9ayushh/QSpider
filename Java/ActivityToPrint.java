public class ActivityToPrint {
    public static void main(String[] args) {
        // WAP to print the sum of 2 integer number.
        int num1, num2;
        // initialization
        num1 = 5;
        num2 = 4;
        int sum = num1 + num2;
        // Accessing the element
        System.out.println(sum);

        // WAP to print the sum of 2 floating point number.
        float numFloat1, numFloat2;
        // initialization
        numFloat1 = 7.80f;
        numFloat2 = 2.89f;
        float floatSum = numFloat1 + numFloat2;
        // Accessing
        System.out.println(floatSum);


        // WAP to print the sum of 1 integer number and 2 floating point number
        int intNum1 = 4;
        float floatNum1 = 23.4f, floatNum2 = 45.04f;
        float threeSum = intNum1 + floatNum1 + floatNum2;
        System.out.println(threeSum);

        // WAP to print the sum of 2 integer number which is stored in byte type container.
        int val1 = 5;
        int val2 = 35;
        byte byteSum = (byte) (val1 + val2);
        System.out.println(byteSum);

        // WAP to print the sum of 2 integer number which is stored in short type container.
        int intVal1 = 5;
        int intVal2 = 5;
        short shortSum = (short) (intVal1 + intVal2);
        System.out.println(shortSum);
    }
}