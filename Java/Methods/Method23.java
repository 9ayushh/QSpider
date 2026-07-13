public class Method23 {
    public static void print(){
        int a = 5;
        switch(a) {
            case 1 : {
                System.out.println("Monday");
            }
            break;
            case 2 : {
                System.out.println("Tuesday");
            }
            break;
            case 3 : {
                System.out.println("Wednesday");
            }
            break;
            case 4 : {
                System.out.println("Thursday");
            }
            break;
            case 5 : {
                System.out.println("Friday");
            }
            break;
            case 6 : {
                System.out.println("Saturday");
            }
            break;
            case 7 : {
                System.out.println("Sunday");
            }
            break;
            default : {
                System.out.println("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        // 23. WAJP to create a method which check and print number of days present in the month based on month number
        print();
    }
}
