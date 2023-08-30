package com.java4rohit.LeetCode.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GetOrDefault {


    public static void main(String[] args) {
        String s = "abbaca";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            if (map.get(s.charAt(i)) == 2) {
                map.remove(s.charAt(i));
            }

        }
        System.out.println(map);
        StringBuffer s1 = new StringBuffer();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey());
            if (entry.getValue() != 0) {
                s1 = s1.append(entry.getKey());
            }

        }

        System.out.println(s1.toString());
    }
}

