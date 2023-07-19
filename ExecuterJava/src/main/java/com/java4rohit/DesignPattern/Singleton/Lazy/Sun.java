package com.java4rohit.DesignPattern.Singleton.Lazy;
/*//Lazy way of creating singleton
1.Constructor must be private
2.only provide getSun Method and this must be static
 */

import java.io.Serializable;

public class Sun implements Serializable, Cloneable {

    private static Sun sun;

    private Sun() {
        if (sun != null) {
            throw new RuntimeException("You are trying to break Singleton Pattern");
        }
    }

    public static Sun getSun() {
        if(sun == null) {
           synchronized (Sun.class) {
                if (sun == null) {
                    sun = new Sun();
                }
            }
        }
        return sun;
    }

    //Implement ReadResolve
    public Object readResolve() {
        return sun;
    }

    // override clone method

    @Override
     public Object clone() throws CloneNotSupportedException {
     return sun;
    }
}
