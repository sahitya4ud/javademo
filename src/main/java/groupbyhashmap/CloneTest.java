package groupbyhashmap;

import org.example.Employee;

public class CloneTest {

    public static void main(String[] args) {
        Employee first = new Employee();
        first.setEmpId("1");
        first.setSalary(1000);
        first.setDept("IT");

        Employee second = first;

        System.out.println("first"+first);

        System.out.println("second"+second);

        first.setSalary(5000);



        Employee firstdeepClone = new Employee();
        firstdeepClone.setEmpId("1");
        firstdeepClone.setSalary(1000);
        firstdeepClone.setDept("IT");

        Employee seconddeepClone = first;

        seconddeepClone.setSalary(firstdeepClone.getSalary());
        seconddeepClone.setDept(firstdeepClone.getDept());
        seconddeepClone.setEmpId(firstdeepClone.getEmpId());

        System.out.println("firstdeepClone"+firstdeepClone);

        System.out.println("seconddeepClone"+seconddeepClone);

        first.setSalary(5000);
    }
}
