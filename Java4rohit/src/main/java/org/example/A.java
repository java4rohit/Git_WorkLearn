package org.example;

public interface A {
    default void adds(){
        System.out.println("A");
    }
}
