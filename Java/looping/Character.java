public class Character {
    public static void main(String[] args) {

        char ch = 'A';

        // Q14: Check A or a
        if (ch == 'A' || ch == 'a') {
            System.out.println("Character is A or a");
        }else {
            System.out.println("Character is not A or a");
        }

        // Q15: Check Q or q
        if (ch == 'Q' || ch == 'q') {
            System.out.println("Character is Q or q");
        } else {
            System.out.println("Character is not Q or q");
        }

        // Q16: Uppercase character or not
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Character");
        } else {
            System.out.println("Not Uppercase Character");
        }

        // Q17: Lowercase character or not
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Character");
        } else {
            System.out.println("Not Lowercase Character");
        }

        // Q18: Alphabet or not
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not Alphabet");
        }

        // Q19: Digit character or not
        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit Character");
        } else {
            System.out.println("Not Digit Character");
        }

        // Q20: Uppercase vowel or not
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Uppercase Vowel");
        } else {
            System.out.println("Not Uppercase Vowel");
        }

        // Q21: Lowercase vowel or not
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Lowercase Vowel");
        } else {
            System.out.println("Not Lowercase Vowel");
        }

        // Q22: Vowel or not
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not Vowel");
        }

        // Q23: Uppercase consonant or not
        if ((ch >= 'A' && ch <= 'Z') &&
                !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
            System.out.println("Uppercase Consonant");
        } else {
            System.out.println("Not Uppercase Consonant");
        }

        // Q24: Lowercase consonant or not
        if ((ch >= 'a' && ch <= 'z') &&
                !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            System.out.println("Lowercase Consonant");
        } else {
            System.out.println("Not Lowercase Consonant");
        }
    }
}