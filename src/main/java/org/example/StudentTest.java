package org.example;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "sahitya";
        student1.fatherName = "ramesh";
        student1.mobileNumber = "12345";
        student1.city = "kadapa";
        student1.state = "ap";

        System.out.println("Student Name" + student1.name);

        Employee employee1 = new Employee();
         employee1.name = "sahitya";
         employee1.age = 22;
         employee1.employeeId = "1";
         employee1.designation = "senior";
         employee1.city = "kadapa";
         employee1.salary = 5000;
         employee1.state = "ap";
         employee1.pinCode = 51870;
        System.out.println("Employee Name" + employee1.name + "Employee Age" + employee1.age
        + "Employee Designation" + employee1.designation + "Employee city" + employee1.city
        + "Employee salary" + employee1.salary + "Employee state" + employee1.state +
                "Employee pincode" + employee1.pinCode);

        Company company1 = new Company();
        company1.name = "educate";
        company1.address = "sent";
        company1.city = "hyd";
        company1.department = "hr";
        company1.state = "tg";
        System.out.println("Company Name" + company1.name);


    }


}

