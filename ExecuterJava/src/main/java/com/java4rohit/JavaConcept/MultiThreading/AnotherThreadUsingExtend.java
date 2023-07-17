package com.java4rohit.JavaConcept.MultiThreading;


// creating our thread using Extend Thread class.
public class AnotherThreadUsingExtend extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println("value of another i: "+i);
        }
    }

}
