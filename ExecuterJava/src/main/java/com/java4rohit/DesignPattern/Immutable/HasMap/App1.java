package com.java4rohit.DesignPattern.Immutable.HasMap;

import java.util.HashMap;
import java.util.Map;

public class App1 {

    public static void main(String[] args) {


        Map<Employee,String>  map = new HashMap<>();
        Employee employee = new Employee("Rohit");
        map.put(employee,"UP");
        System.out.println(map.get(employee));

        System.out.println(map.get(employee));
    }
}
