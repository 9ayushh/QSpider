public class Employee {
    private int empid=6;
    private String ename;
    private long phno;
    int pwd = 9934;

    // fetch
    public void getEmpId(int pwd){
        if(pwd == 9934){
            System.out.println(empid);
        } else {
            System.out.println("invalid pwd");
        }
    }
    
    // set
    public void setEmpId(int empid, int pwd){
        if(pwd == 9934){
            this.empid = empid;
        } else {
            System.out.println("invalid pwd");
        }
    }

    public void setEmpid(int empid){
        this.empid = empid;
    }
    public int getEmpid(){
        return empid;
    }

    public void setEname(String ename){
        this.ename = ename;
    }
    public String getEname(){
        return ename;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }
    public long getPhno(){
        return phno;
    }

}
