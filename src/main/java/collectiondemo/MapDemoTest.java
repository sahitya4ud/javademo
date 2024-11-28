package collectiondemo;

import java.util.*;

public class MapDemoTest {

    public static void main(String[] args) {

        Map<String,Integer> myMarksMap = new HashMap<>(); //hash code is in obj class,hash map is
        //map works on bucket,stream is a pipeline sequence based
        //Insert data into map
        myMarksMap.put("English",75);//put is an instance method
        myMarksMap.put("Hindi",36);
        myMarksMap.put("Social",37);
        myMarksMap.put("Science",40);


        //Retrive of data from Map

        Set<Map.Entry<String,Integer>> entrySet = myMarksMap.entrySet();//set of obj reference of entry of key value but iterator gives actual value,set contains the entry,entry set is an obj on map
        //execution done in stack,obj created in map
        Iterator<Map.Entry<String,Integer>> itr = entrySet.iterator();

        while(itr.hasNext()) {//while it do until condition terminate,hasnext is an instance method on iterator class,iterator method is an object of set
            Map.Entry<String, Integer> entryMap = itr.next();
            System.out.println(entryMap.getKey() + " value " + entryMap.getValue());


        }


        myMarksMap.entrySet().stream().forEach( entry ->{
            System.out.println(entry.getKey() + " value " + entry.getValue());
        });

        Map<String,Integer> myMarksSortedMap = new TreeMap<>(); //hash code is in obj class,hash map is
        //map works on bucket,stream is a pipeline sequence based
        //Insert data into map
        myMarksSortedMap.put("English",75);//put is an instance method
        myMarksSortedMap.put("Hindi",36);
        myMarksSortedMap.put("Social",37);
        myMarksSortedMap.put("Science",40);

        myMarksSortedMap.entrySet().stream().forEach( entry ->{
            System.out.println(entry.getKey() + " value " + entry.getValue());
        });

        Map<EmployeeEntity, EmployeeEntity> myEmployeeMap = new TreeMap<>(); //hash code is in obj class,hash map is
        //map works on bucket,stream is a pipeline sequence based
        //Insert data into map

        EmployeeEntity sahityaEmp = new EmployeeEntity("Sahitya","NE01",true);

        sahityaEmp.setSalary(30000);
        sahityaEmp.setAadhar("1");

        EmployeeEntity keerthiEmp = new EmployeeEntity("Keerthi","NE02",true);

        keerthiEmp.setSalary(50000);
        keerthiEmp.setAadhar("2");
        EmployeeEntity keerthi1Emp = new EmployeeEntity("Keerthi1","NE02",true);

        keerthi1Emp.setSalary(10000);
        keerthi1Emp.setAadhar("4");
        myEmployeeMap.put(sahityaEmp ,sahityaEmp );//put is an instance method
        myEmployeeMap.put(keerthiEmp,keerthiEmp);
        myEmployeeMap.put(keerthi1Emp,keerthi1Emp);

        long empCount = myEmployeeMap.entrySet().stream().count();

        System.out.println(empCount);

        long activeEmpCount = myEmployeeMap.entrySet().stream().filter(mapEntry -> {
            return  mapEntry.getValue().isStatus();


        }).count();
            System.out.println(activeEmpCount);
            //filter
            //map

            List<Emp> empListForPayroll = myEmployeeMap.entrySet().stream().filter( mapEntry -> {
                return mapEntry.getValue().isStatus();
            }).map(myEntry -> {

            });

            System.out.println(activeEmpCount);



            //flatMap

        //reduce
        }

//myMarksSortedMap.entrySet().stream().forEach( entry ->{
       // System.out.println(entry.getKey().getEmpId() + " value " + entry.getValue().getName());
    }


