package com.java4rohit.DesignPattern.Singleton.Lazy;

public class Thread2 extends Thread{

    public void run(){
       Sun s=  Sun.getSun();
        System.out.println("Thread2 :"+s.hashCode());
    }
}
