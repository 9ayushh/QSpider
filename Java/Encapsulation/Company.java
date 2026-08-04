public class Company {
    
    Employee e = new Employee();
    static Employee es = new Employee();
    public static void main(String[] args){
        Employee ep = new Employee();
        // System.out.println(ep.getEmpid());
        // System.out.println(ep.getEname());
        // System.out.println(ep.getPhno());

        // ep.getEmpId(9934);

        // local
        System.out.println(ep.getEmpid());

        // static
        System.out.println(es.getEmpid());

        // non-static
        Company c = new Company();
        System.out.println(c.e.getEmpid());
    }
}


