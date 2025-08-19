package com.demo.day10_set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDriver {
    public static void main(String[] args) {

        // Map is used to keep my key - value
        // no order
        // not sorted
        // no duplicate keys [it will overwrite the value]
        // allows duplicate values
        // add one null key
        // add multiple null values

        Map<Integer, String> areaPinCode = new HashMap<>();
        areaPinCode.put(570011, "Chennai");
        areaPinCode.put(560022, "Delhi");
        areaPinCode.put(56001, "Bangalore");

        System.out.println(areaPinCode);
        // if key already exists it will update the value
        areaPinCode.put(56001, "new Bangalore");
        System.out.println(areaPinCode);
        areaPinCode.put(56002, "new Bangalore"); // add duplicate value
        System.out.println(areaPinCode);
        areaPinCode.put(null, "Ford"); // add duplicate value
        areaPinCode.put(null, "new Ford"); // add duplicate value

        System.out.println(areaPinCode);
        areaPinCode.put(560055, null);
        areaPinCode.put(560066, null);
        System.out.println(areaPinCode);
        // CRUD
        // Read
        System.out.println("Area of pin 570011 ?" + areaPinCode.get(570011));
        System.out.println("Area of pin 570099 ?" + areaPinCode.get(570099));
        System.out.println("Area of pin 570055 ?" + areaPinCode.get(570055));
        if (areaPinCode.containsKey(570099)) {
            System.out.println("Area of pin 570099 ?" + areaPinCode.get(570099));
        }
        else
            System.out.println(" pin 570099 not available");
        // Update
        // to replace
        System.out.println("Ford value got replaced ?"+ areaPinCode.replace(100,"Ford India"));
        System.out.println("key 560066 value got replaced ?"+ areaPinCode.replace(560066,"Ford USA"));

        System.out.println(areaPinCode);
        // delete
        areaPinCode.remove(570011);
        System.out.println(areaPinCode);
        System.out.println("All keys:"+areaPinCode.keySet());
        System.out.println("All Values:"+areaPinCode.values());
        System.out.println("Contains Ford USA:"+areaPinCode.containsValue("Ford USA"));

        // CRUD operation on Employee map
        Map<Integer,Employee> employeeMap = new HashMap<>();
        employeeMap.put(111,new Employee(111,"Name 111",111.0));
        employeeMap.put(222,new Employee(222,"Name 222",222.0));
        employeeMap.put(333,new Employee(333,"Name 333",333.0));
        System.out.println(employeeMap);
        System.out.println("emp having id 333 ? "+ employeeMap.get(333));
        // Update name of id 333
        Employee modifyEmployee = employeeMap.get(333);
        modifyEmployee.setName("Ford India");
        System.out.println(employeeMap);
        // delete
        employeeMap.remove(333);
        System.out.println(employeeMap);
        // maintain order of insertion
        Map<Integer,Employee> orderedEmployeeMap = new LinkedHashMap<>();
        orderedEmployeeMap.put(111,new Employee(111,"Name 111",111.0));
        orderedEmployeeMap.put(222,new Employee(222,"Name 222",222.0));
        orderedEmployeeMap.put(5,new Employee(5,"Name 5",5.0));

        System.out.println("ordered map:"+ orderedEmployeeMap);
 // sorted map
        Map<Integer,Employee> sortedEmployeeMap = new TreeMap<>(orderedEmployeeMap);
        System.out.println("Sorted emp map"+sortedEmployeeMap);



    }
}
