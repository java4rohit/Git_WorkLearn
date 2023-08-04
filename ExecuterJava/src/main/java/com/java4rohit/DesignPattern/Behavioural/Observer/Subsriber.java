package com.java4rohit.DesignPattern.Behavioural.Observer;

public class Subsriber implements  Observer {
    @Override
    public void notified() {
        System.out.println("new video is upload : notification");
    }
}
