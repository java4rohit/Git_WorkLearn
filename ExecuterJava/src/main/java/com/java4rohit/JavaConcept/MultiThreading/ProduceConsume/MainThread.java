package com.java4rohit.JavaConcept.MultiThreading.ProduceConsume;

public class MainThread {


    public static void main(String[] args) {
        Company c = new Company();
        Producer producer = new Producer(c);
        Consumer consumer = new Consumer(c);

        producer.start();
        consumer.start();
    }
}
