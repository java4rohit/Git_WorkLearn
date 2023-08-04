package com.java4rohit.LeetCode.HashMap;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {


        String s = "aaca";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        }

        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey());
        }
    }
}
