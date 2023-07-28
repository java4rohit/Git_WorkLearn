package com.java4rohit.DesignPattern.Singleton.Lazy;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
  /*
     Break SingleTon Design patter
           0. In MultiThreaded Env...
           1.Problem: Reflection API to Break singleton pattern
           2.Solution:if Object is there -> throw exception from inside constructor
           3.Solution:Use Enum
  */
        Sun s1 = Sun.getSun();
        System.out.println("S1 hashCode "+s1.hashCode());
// 3.break singleton using cloneable
        Sun s2 = (Sun) s1.clone();
        System.out.println("Clone break single Or nor"+s2.hashCode());
/*
 // 1. First Way to Break Singleton using Reflection

        Constructor<Sun> constructor = Sun.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Sun s2 = constructor.newInstance();
        System.out.println("Using Reflection s2: " + s2.hashCode());


// Solution1 ::Solution:if Object is there -> throw exception from inside constructor
// Solution2 :=================Singleton Using Enum

        Sun1 sun = Sun1.INSTANCE;
        System.out.println("Using ENUM :"+sun.hashCode());

        Sun1 sun1 = Sun1.INSTANCE;
        System.out.println("Using ENUM :"+sun1.hashCode());


//2. Break singleton using Serialization and deserialization

        Sun s3=Sun.getSun();
        System.out.println(s3.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s1);

        System.out.println("Serialization Is Done");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Sun s4= (Sun) ois.readObject();
        System.out.println(s4.hashCode());

    //Solution ::======================= Implement ReadResolve method to

*/
    }
}
