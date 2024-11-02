package org.example.constructors;

public class Student1 {
    public String name;
    public String fatherName;
    public String mobileNumber;
    public String city;
    public String state;
//    public Student1(){
//
//    }
//    public Student1(String name,String fatherName,String mobileNumber){
//        this.name = name;
//        this.fatherName = fatherName;
//        this.mobileNumber = mobileNumber;
//    }
//    public Student1(String name,String fatherName,String mobileNumber,String city,String state){
//        this(name,fatherName,mobileNumber);
//        this.city= city;
//        this.state=state;
//
//    }
    private Student1(){

    }
public static Student1 getInstance(){
        Student1 student1 = new Student1();
        return student1;
}
    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
