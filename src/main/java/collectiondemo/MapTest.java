package collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapTest  {
    public static void main(String[] args) {

        EmployeeService employeeService=new EmployeeService();

        EmployeeEntity sahitya= new EmployeeEntity("sahitya","N801",true);
        EmployeeEntity keerthi=  new EmployeeEntity("keerthi","N802",true);

        Map<String, EmployeeEntity> employeeMap=new HashMap<>();//created map object,created multikeymap in order

        employeeMap.put(sahitya.getEmpId(),sahitya);
        employeeMap.put(keerthi.getEmpId(),keerthi);

        Map<EmployeeEntity, EmployeeEntity> EmployeeemployeeMap = new HashMap<>();
        EmployeeemployeeMap.put(sahitya,sahitya);
        EmployeeemployeeMap.put(keerthi,keerthi);
        EmployeeemployeeMap.put(sahitya,keerthi);


        employeeService.processSalary(employeeMap);

    }
}
