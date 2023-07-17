package com.java4rohit.DesignPattern.Immutable.HasMap;

import java.util.Objects;

public class Employee {

    private final String empName;

    public Employee(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empName, employee.empName);
    }

    @Override
    public int hashCode() {
        int result =  Objects.hash(empName);
        return result;
    }
}
