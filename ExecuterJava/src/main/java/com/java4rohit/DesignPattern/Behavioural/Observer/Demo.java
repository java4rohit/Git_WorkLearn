package com.java4rohit.DesignPattern.Behavioural.Observer;

public class Demo {

    public static void main(String[] args) {


        YoutubeChannel channel = new YoutubeChannel();
        Subsriber aman = new Subsriber();
        channel.subscribe(aman);

        channel.notifyChanges();

    }
}
