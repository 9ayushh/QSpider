public class Method6 {
    public static void details(int id, int year, int age, String name, char section, boolean isStudent, long phoneNo, float marks, int batch, float fee){
        
        System.out.println(id);
        System.out.println(year);
        System.out.println(age);
        System.out.println(name);
        System.out.println(section);
        System.out.println(isStudent);
        System.out.println(phoneNo);
        System.out.println(marks);
        System.out.println(batch);
        System.out.println(fee);
    }
    public static void main(String[] args){ 
        // 6. WAJP to create a method which print 10 details of a students
        details(1, 2025, 20, "Raj", 'A', true, 9876543210L, 87.9f, 2029, 453423.00f);
    }
}
