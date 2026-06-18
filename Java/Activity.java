public class Activity {
    public static void activity1() {
        // Write a java program to store and print your name, age, dateOfBirth and contact number
        String name;
        int age;
        String dob;
        long contact;

        // Initialization
        name = "Raj";
        age = 20;
        dob = "29-09-2005";
        contact = 9234567890L;

        // Accessing
        System.out.println(name);
        System.out.println(age);
        System.out.println(dob);
        System.out.println(contact);
        
    }

    public static void activity2() {
        // Write a java program to convert a character into a number.
        
        char charVal = 'B';
        int charToInt = (char) charVal;
        System.out.println(charToInt);

    }

    public static void activity3() {
        // Write a java program to store int value into the byte, short, long, float, double, char type variable.

        int intVal = 4567;

        byte intToByte = (byte) intVal;
        System.out.println(intToByte);

        short intToShort = (short) intVal;
        System.out.println(intToShort);

        long intToLong = intVal;
        System.out.println(intToLong);
        
        float intToFloat = intVal;
        System.out.println(intToFloat);

        double intToDouble = intVal;
        System.out.println(intToDouble);

        char intToChar = (char) intVal;
        System.out.println(intToChar);

    }

    public static void activity4() {
        // Write a java program to convert the double value(56.09) into int type and print it.

        double doubleVal = 56.09;
        int doubleToInt = (int) doubleVal;
        System.out.println(doubleToInt);

    }

    public static void activity5() {
        // Write a java program to store char type data('A') inside the short and int type variable and print it.

        char charVal = 'A';

        short charToShort = (short) charVal;
        System.out.println(charToShort);

        int charToInt = charVal;
        System.out.println(charToInt);

    }

    public static void main(String[] args){
        activity1();
        activity2();
        activity3();
        activity4();
        activity5();

    }
}
