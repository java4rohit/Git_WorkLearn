package com.java4rohit.DesignPattern.CreationalPattern.Factory;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = DeveloperFactory.getDeveloper("Java Developer");
        System.out.println(employee.salary());

        Employee employee2 = DeveloperFactory.getDeveloper("Web Developer");
        System.out.println(employee2.salary());

    }
}
