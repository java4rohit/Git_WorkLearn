package com.java4rohit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		String input = "KyaYaarKyaKrrahahai";

		String[] result = input.split("");

		Map<String, List<String>> collect = Arrays.stream(result).collect(Collectors.groupingBy(s -> s));

		Map<String, Long> counttheCharater = Arrays.stream(result).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		

		List<String> findtheDublicateElement = Arrays.stream(result)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(x -> x.getValue()>1)
				.map(Map.Entry :: getKey)
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
		System.out.println(findtheDublicateElement);
	}

}
