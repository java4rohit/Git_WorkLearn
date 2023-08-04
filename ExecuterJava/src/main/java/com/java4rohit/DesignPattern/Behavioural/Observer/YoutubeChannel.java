package com.java4rohit.DesignPattern.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    List<Observer> subscribeList = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscribeList.add(ob);
    }

    @Override
    public void unsuscribe(Observer ob) {
        this.subscribeList.remove(ob);
    }

    @Override
    public void notifyChanges() {
        for (Observer ob:this.subscribeList) {
            ob.notified();

        }
    }
}
