package com.java4rohit.DesignPattern.CreationalPattern.Prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NetworkConnection implements  Cloneable{

    private String ip;
    private String data;

    private List<String> domain  =  new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domain=" + domain +
                '}';
    }

    public void loadImportantData() throws InterruptedException {
        this.data ="Very very Important data";
        //it will take 1 min;
        Thread.sleep(1000);
        domain.add("www.google.com");
        domain.add("www.yyy.com");
        domain.add("www.mmmm.com");
    }

    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    @Override
    public NetworkConnection clone() throws CloneNotSupportedException {

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.ip);
        networkConnection.setData(this.data);

        for (String d :this.getDomain()) {
            networkConnection.getDomain().add(d);
        }
        return networkConnection;

    }
}
