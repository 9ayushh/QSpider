public class Method7 {
    public static void empDetails(int id, int year, int age, String name, char branch, boolean isWorking, long phoneNo, float profit, int batch, float salary, int overtimeHour, int workingHour, float commission, String company, int deptNo){
        
        System.out.println(id);
        System.out.println(year);
        System.out.println(age);
        System.out.println(name);
        System.out.println(branch);
        System.out.println(isWorking);
        System.out.println(phoneNo);
        System.out.println(profit);
        System.out.println(batch);
        System.out.println(salary);
        System.out.println(overtimeHour);
        System.out.println(workingHour);
        System.out.println(commission);
        System.out.println(company);
        System.out.println(deptNo);
    }
    public static void main(String[] args){ 
        // 7. WAJP to create a method which print 15 details of a employee
        empDetails(1, 2025, 20, "Raj", 'A', true, 9876543210L, 97.4f, 2029, 456788.00f, 5, 8, 400.50f, "technom", 30);
    }
}
