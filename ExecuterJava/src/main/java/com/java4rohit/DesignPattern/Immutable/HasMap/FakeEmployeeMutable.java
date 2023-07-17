package com.java4rohit.DesignPattern.Immutable.HasMap;


import java.util.Objects;

//mutable class
public class FakeEmployeeMutable extends Employee {

    private String fakeEmployee;

    public FakeEmployeeMutable(String empName) {
        super(empName);
        this.fakeEmployee = empName;
    }

    @Override
    public String getEmpName() {
        return fakeEmployee;
    }

    public String getFakeEmployee() {
        return fakeEmployee;
    }

    public void setFakeEmployee(String fakeEmployee) {
        this.fakeEmployee = fakeEmployee;
    }


    @Override
    public String toString() {
        return "FakeEmployeeMutable{" +
                "fakeEmployee='" + fakeEmployee + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FakeEmployeeMutable that = (FakeEmployeeMutable) o;
        return Objects.equals(fakeEmployee, that.fakeEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fakeEmployee);
    }
}

