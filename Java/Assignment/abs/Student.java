public class Student {
    int studId;
    String name;
    int yop;
    double percentage;
    static String clgName;
    static String clgAdd;
    long phNo;
    char section;
    static long clgPh;
    String degree;

    public static void viewClgDetails() {
        System.out.println(clgName);
        System.out.println(clgAdd);
        System.out.println(clgPh);
    }

    public void studDetails() {

        System.out.println(studId);
        System.out.println(name);
        System.out.println(yop);
        System.out.println(percentage);
        System.out.println(phNo);
        System.out.println(section);
        System.out.println(degree);
    }

    public Student(){
        System.out.println("Constructor Created");
    }
    public Student(int roll){
        System.out.println(roll);
    }
    public Student(String s){
        System.out.println(s);
    }
    public Student(int a, int b){
        System.out.println(a+b);
    }
    public Student(boolean x){
        System.out.println(x);
    }


    public static void main(String[] args){
        // Student(); // error

        new Student(); // anonymous object

        new Student(1, 5); 

        // System.out.println(new Student(6));
        // Student ref = new Student("hello");
        // System.out.println(ref);

        // ref.studDetails();
        // viewClgDetails();
    }
}
