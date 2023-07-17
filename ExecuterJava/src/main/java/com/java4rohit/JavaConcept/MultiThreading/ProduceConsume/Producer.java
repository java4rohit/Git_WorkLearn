package com.java4rohit.JavaConcept.MultiThreading.ProduceConsume;

import com.java4rohit.JavaConcept.MultiThreading.ProduceConsume.Company;

class Producer extends Thread {
    Company c;
    Producer(Company c)
    {
        this.c=c;
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            try {
                this.c.produce_item(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(1000);}catch(Exception e){}
            i++;
        }
    }
}