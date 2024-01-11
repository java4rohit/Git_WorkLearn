package org.example;

public interface B {

    default void adds(){
        System.out.println("B");
    }
}
