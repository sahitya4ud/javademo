package streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamsDemoTest {

    public static void main(String[] args) {

        Employee e = new Employee("NE1","IT");
        System.out.println(e.hashCode());

        List<Employee>  employeeList= new ArrayList<>();

        employeeList.add(new Employee("NE2","CSE"));
        employeeList.add(new Employee("NE3", "ECE"));
        employeeList.add(new Employee("NE4", "EEE"));

        int startIndex = 0;

        int endIndex = employeeList.size();



        for(int startI=0; startI<employeeList.size(); startI++){
            System.out.println(employeeList.get(startI).getId()+"  "+ employeeList.get(startI).hashCode()+" "+startI);
        }
           employeeList.stream().forEach(mydemoEmp-> {
               System.out.println( mydemoEmp.getId()+"  "+ mydemoEmp.hashCode());
           });

        Predicate<Employee> deptPredicate = (empPredicate) -> empPredicate.getDept().equals("IT");


        employeeList.stream().filter( emp -> deptPredicate.test(emp)).forEach( mydemoEmp -> {
            System.out.println(mydemoEmp.getId()+" "+mydemoEmp.hashCode());

        });
    }
}
