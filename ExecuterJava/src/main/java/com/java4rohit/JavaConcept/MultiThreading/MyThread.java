package com.java4rohit.JavaConcept.MultiThreading;


// creating our thread using Runnable Interface
public class MyThread implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println("value of i: "+i);
        }
    }
    public static void main(String[] args) {

        //creating the object of MyThread
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

        //calling AnotherThread
        //creating the object of AnotherThread
        AnotherThreadUsingExtend anotherThread = new AnotherThreadUsingExtend();
        anotherThread.start();
    }
}
