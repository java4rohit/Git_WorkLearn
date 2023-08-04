package com.java4rohit.DesignPattern.CreationalPattern.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        System.out.println("creating the object of prototype ");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192:172.0.1");
        networkConnection.loadImportantData();



//we want new object network connection.
        NetworkConnection networkConnection1   = (NetworkConnection) networkConnection.clone();
        NetworkConnection networkConnection2   = (NetworkConnection) networkConnection.clone();

        System.out.println(networkConnection);
        networkConnection.getDomain().remove(0);

        System.out.println(networkConnection1);
        System.out.println(networkConnection2);

    }
}
