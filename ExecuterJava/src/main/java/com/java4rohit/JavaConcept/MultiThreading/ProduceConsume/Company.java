package com.java4rohit.JavaConcept.MultiThreading.ProduceConsume;

public class Company {
    int n;

    boolean f =false;

    //if f is false : chance :produce
    //if f is true : chance:consume
    synchronized public void produce_item(int n) throws InterruptedException{
         if(f){
             wait();
         }
        this.n = n;
        System.out.println("Produce :" + n);
        f=true;
        notify();
    }

    synchronized public int consume_item() throws InterruptedException {
        if(!f){
            wait();
        }
        System.out.println("Consume :" + n);
        f=false;
        notify();
        return this.n;
    }
}
