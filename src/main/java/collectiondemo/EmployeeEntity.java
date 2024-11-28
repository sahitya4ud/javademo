package collectiondemo;

public class EmployeeEntity implements Comparable<EmployeeEntity> {

private String name;
private String  EmpId;
private boolean status;
private double salary;
private String aadhar;

public EmployeeEntity(String name, String EmpId, boolean status){
    this.name=name;
    this.EmpId=EmpId;
    this.status=status;
}

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return EmpId;
    }

    public boolean isStatus() {
        return status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String toString(){
    return "Employee{"+"name="+name+'\''+", empId='" +EmpId + '\''+ '}' ;
}

    @Override
    public int compareTo(EmployeeEntity o) {
        System.out.println(" current value "+this.EmpId+"other value"+o.EmpId);
        int value = this.EmpId.compareTo(o.EmpId);
        System.out.println("value"+value);
        return value;
    }
}
