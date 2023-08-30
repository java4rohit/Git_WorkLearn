package com.java4rohit.DesignPattern.CreationalPattern.Factory;

public class JavaDeveloper implements   Employee{
    @Override
    public int salary() {
        System.out.println("getting the salary of JavaDeveloper ");
        return 40000;
    }
}
