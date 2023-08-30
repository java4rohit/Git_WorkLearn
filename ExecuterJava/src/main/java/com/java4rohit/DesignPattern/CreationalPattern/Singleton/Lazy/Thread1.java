package com.java4rohit.DesignPattern.CreationalPattern.Singleton.Lazy;

public class Thread1 extends Thread{

    public void run(){
       Sun s=  Sun.getSun();
       System.out.println("Thread1 :"+s.hashCode());
    }
}

