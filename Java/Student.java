public class Student {
    public static void main(String[] args) {
        System.out.println("Student Variable Declaration/Initialization/Accessing");
        int studentId;
        String studentName;
        String branch;
        char section;
        float studentMarks;

        // Initialization
        studentId = 101;
        studentName = "Harsh";
        branch = "B.Tech";
        section = 'A';
        studentMarks = 82.5f;

        // Accessing the variables
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Branch: " + branch);
        System.out.println("Student Section: " + section);
        System.out.println("Student Marks: " + studentMarks);

    }
}
