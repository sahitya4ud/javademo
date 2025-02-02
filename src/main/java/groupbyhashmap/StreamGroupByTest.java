package groupbyhashmap;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.util.Comparator.comparingDouble;
import static java.util.function.BinaryOperator.maxBy;
import static java.util.function.BinaryOperator.minBy;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class StreamGroupByTest {
    public static void main(String[] args) {


    List<Employee> itEmpList = new ArrayList<>();

    Employee first = new Employee();
    first.setEmpId("1");
    first.setSalary(1000);
    first.setDept("IT");
    Employee second = new Employee();
    second.setEmpId("2");
    second.setSalary(2000);
    second.setDept("IT");
    Employee third = new Employee();
    third.setEmpId("3");
    third.setSalary(2000);
    third.setDept("IT");
    itEmpList.add(first);
    itEmpList.add(second);
    itEmpList.add(third);
    Employee cscfirst = new Employee();
    cscfirst.setEmpId("4");
    cscfirst.setSalary(5000);
    cscfirst.setDept("csc");
    Employee cscsecond = new Employee();
    cscsecond.setEmpId("5");
     cscsecond.setSalary(1000);
     cscsecond.setDept("csc");
    Employee cscthird = new Employee();
    cscthird.setEmpId("6");
     cscthird.setSalary(1000);
     cscthird.setDept("csc");
     itEmpList.add(cscfirst);
     itEmpList.add(cscsecond);
     itEmpList.add(cscthird);


     List<String>  empIdlist = itEmpList.stream().map(Employee::getEmpId).collect(toList());

     List<String> empIdlistWithRef = itEmpList.stream().map(emp -> emp.getEmpId()).collect(toList());

      System.out.println("   Employee::getEmpId  " +empIdlist);

      System.out.println(" emp -> emp.getEmpId()" + empIdlistWithRef);


      Map<String,List<Employee>> departmenttempMap = itEmpList.stream()
              .collect(groupingBy(emp ->emp.getDept(), Collectors.toList()));

      System.out.println(departmenttempMap);


    Map<String,Double> departmentemp = itEmpList.stream()
            .collect(groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
    System.out.println(departmentemp);

    //Map<String, Optional<Employee>> departmentmaxemp = itEmpList.stream()
          //  .collect(groupingBy(Employee::getDept, maxBy(Comparator.comparingDouble(Employee::getSalary)));
    //System.out.println(departmentmaxemp);

//        Map<String,Optional<Employee>> deptMaxEmp=itEmpList.stream().collect(
//                groupingBy(Employee::getDept,maxBy(Comparator.comparingDouble(Employee::getSalary))));
//
//    Map<String, Optional<Employee>> departmentLowemp = itEmpList.stream()
//            .collect(groupingBy(Employee::getDept, min(comparingDouble(Employee::getSalary)));
//    System.out.println(departmentLowemp);



    }

}
