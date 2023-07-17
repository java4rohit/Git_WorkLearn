package com.java4rohit.DesignPattern.Immutable.HasMap;

import java.util.HashMap;

/*
if i am not making my immutable class final then somebody can extend my class and change
the behaviour of the particular class
 */
public class App2 {
    public static void main(String[] args) {

        FakeEmployeeMutable fakeEmployeeMutable = new FakeEmployeeMutable("FakeName");
        //  Employee employee = new Employee("Yash");
        Employee employeeImmutable = fakeEmployeeMutable;
        HashMap<Employee, String> map = new HashMap<>();
        map.put(employeeImmutable, "India");
        fakeEmployeeMutable.setFakeEmployee("ChangedName");
        System.out.println(map.get(employeeImmutable));
        System.out.println("*********************");

    }
}
