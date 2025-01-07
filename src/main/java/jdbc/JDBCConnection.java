package jdbc;

import org.example.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class JDBCConnection {

public static Collection<JDBCProject> getEmpAllocation(){
    Map<String,JDBCProject> projectMap = new HashMap<>();
    Collection<JDBCProject> projectList =new ArrayList<>();


    try {
        System.out.println("hi");
        Class.forName("com.mysql.cj.jdbc.Driver");//loading mysql driver into java ram
        System.out.println("hi");
      Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar","root","enter");

      Statement stmt = con.createStatement();

      ResultSet resultSet= stmt.executeQuery("select * from sonar.Project1 p cross join sonar.Employee e on p.id=e.pid");

      while (resultSet.next()){
          System.out.println("Project Name "+resultSet.getString(2)+"Employee Name"+resultSet.getString("name")+"Dept"+resultSet.getString("dept"));
          if(projectMap.containsKey(2)){
              JDBCEmployee jdbcEmployee = new JDBCEmployee();
              jdbcEmployee.setName(resultSet.getString(6));
             JDBCProject project= projectMap.get(resultSet.getString(2));
               project.getEmployeeList().add(jdbcEmployee);
          }
          else{
             JDBCProject jdbcProject = new JDBCProject();
             jdbcProject.setName(resultSet.getString(2));
             JDBCEmployee jdbcEmployee = new JDBCEmployee();
             jdbcEmployee.setName(resultSet.getString(6));
             List<JDBCEmployee> employees= new ArrayList<>();
             employees.add(jdbcEmployee);
             jdbcProject.setEmployeeList(employees);

          }
      }
    }catch (Exception e){
        System.out.println("Exception occured while fetching data"+e);
    }


            projectList=projectMap.values();
            return projectList;
}


    }


