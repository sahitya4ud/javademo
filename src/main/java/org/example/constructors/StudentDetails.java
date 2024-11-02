package org.example.constructors;

public class StudentDetails {
   private String name;
    private String fatherName;
   private String mobileNumber;
   private String city;
   private String state;
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return this.name;
   }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
