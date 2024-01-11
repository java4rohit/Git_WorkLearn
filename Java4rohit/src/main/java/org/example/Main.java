package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        interface A{
            default {
                System.out.println("a ");
            }
        }
        interface Az{
            default {
                System.out.println("a ");
            }
        }



    }


}