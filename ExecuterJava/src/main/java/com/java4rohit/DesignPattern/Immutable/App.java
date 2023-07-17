package com.java4rohit.DesignPattern.Immutable;

public class App {

    public static void main(String[] args) {

        /*Student s = new Student();
        s.setId(1);
        s.setStudentName("Rohit Yadav");

        System.out.println(s);

        s.setId(2);
        s.setStudentName("Avinash Singh");

        System.out.println(s);*/

        Address a1 = new Address("WB","Durgapur","India");

        Student rohit = new Student(1,"Rohit Yadav",a1);
        System.out.println(rohit+":hashcode: "+rohit.hashCode());

        Address a2 =rohit.getAddress();
        a2.setCity("Delhi");
        a2.setState("UP");

        System.out.println(rohit+":hashcode: "+rohit.hashCode());

    }
}
