public class Narrowing {
    public static void main(String[] args){
        // ---------- double ------------ 

        // double to float
        double doubleValue = 78.34567890;
        float doubleToFloat = (float) doubleValue;
        System.out.println(doubleToFloat);

        // double to long
        double doubleValue2 = 687.4567890;
        long doubleToLong = (long) doubleValue2;
        System.out.println(doubleToLong);

        // double to int
        double doubleValue3 = 46768.4567890;
        int doubleToInt = (int) doubleValue3;
        System.out.println(doubleToInt);

        // double to short 
        double doubleValue4 = 989.34567890;
        short doubleToShort = (short) doubleValue4;
        System.out.println(doubleToShort);

        // double to byte
        double doubleValue5 = 567.876543;
        byte doubleToByte = (byte) doubleValue5;
        System.out.println(doubleToByte);

        // ------------- Float --------------
        // Float to long
        float floatValue = 45.5678f;
        long floatToLong = (long) floatValue;
        System.out.println(floatToLong);
        
        // Float to int
        float floatValue2 = 376.9f;
        int floatToInt = (int) floatValue2;
        System.out.println(floatToInt);
        
        // Float to short
        float floatValue3= 8.093f;
        short floatToShort = (short) floatValue3;
        System.out.println(floatToShort);
        
        // Float to byte
        float floatValue4 = 738.8725f;
        byte floatToByte = (byte) floatValue4;
        System.out.println(floatToByte);

        // --------- Long ----------
        // long to int
        long longValue = 45567895678L;
        int longToInt = (int) longValue;
        System.out.println(longToInt);
        
        // long to short
        long longValue2 = 1234567890L;
        short longToShort = (short) longValue2;
        System.out.println(longToShort);
        
        // long to byte
        long longValue3 = 34567887890L;
        byte longToByte = (byte) longValue3;
        System.out.println(longToByte);

        // ----------- Int -------------
        // int to short
        int intValue = 56893;
        short intToShort = (short) intValue;
        System.out.println(intToShort);

        // int ot byte
        int intValue2 = 567890;
        byte intToByte = (byte) intValue2;
        System.out.println(intToByte);

        // ------------- To Char -------------
        // double to char
        double doubleVal = 45678.45678906789;
        char doubleToChar = (char) doubleVal;
        System.out.println(doubleToChar);

        // float to char
        float floatVal = 56.8f;
        char floatToChar = (char) floatVal;
        System.out.println(floatToChar);

        // long to char
        long longVal = 545678;
        char longToChar = (char) longVal;
        System.out.println(longToChar);

        // int to char
        int intVal = 90;
        char intToChar = (char) intVal;
        System.out.println(intToChar);

        // -------------------
        // short to char
        short shortVal = 189;
        char shortToChar = (char) shortVal;
        System.out.println(shortToChar);

        // char to short
        char charValue = 'V';
        short charToShort = (short) charValue;
        System.out.println(charToShort);
        
        // byte to char
        byte byteVal = 67;
        char byteToChar = (char) byteVal;
        System.out.println(byteToChar);
        
        // char to byte
        char charVal = 'm';
        byte charToByte = (byte) charVal;
        System.out.println(charToByte);





    }
}
