package com.java4rohit.LeetCode.EasyLevel;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortingTheSentence {
	public static void main(String[] args) {

		String s = "z1 z2 z3";
		String str1 = "";
		String[] str = s.split(" ");

		Map<String, Integer> map = new HashMap<>();

		Arrays.stream(str).forEach(string -> map.put(string.substring(0, string.length() - 1),
				Integer.parseInt(string.substring(string.length() - 1, string.length()))));

		String[] demo = new String[map.size()];

		for (Integer t : map.values()) {
			if (t == 3) {
				for (String d : map.keySet()) {
					str1 = str1 + " " + d + " " + d + " " + d;
				}
		       }
		   }
		if (true) {
			for (String d : map.keySet()) {
				str1 = str1 + " " + d + " " + d + " " + d;
			}
		} else {
			map.forEach((k, v) -> {
				System.out.println(k + ":" + v);
				demo[--v] = k;
			});

			for (int i = 0; i < demo.length; i++) {
				str1 += demo[i] + " ";
				str1.trim();
			}
			
		}
		System.out.println("+" + str1.trim() + "+");
	}
}
