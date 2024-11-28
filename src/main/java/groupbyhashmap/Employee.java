package groupbyhashmap;

public class Employee {

    private String EmpId;

    private String Dept;

    private int Salary;



    public String getEmpId() {
        return EmpId;
    }

    public String getDept() {
        return Dept;
    }

    public int getSalary() {
        return Salary;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override

   public String toString() {
       return "Emp{" +
               "Dept='" + Dept + '\'' +
               ", EmpId='" + EmpId + '\'' +
               ", Salary=" + Salary +
               '}';
   }

}
