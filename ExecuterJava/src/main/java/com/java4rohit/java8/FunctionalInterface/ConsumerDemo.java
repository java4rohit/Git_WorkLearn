package com.java4rohit.java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/*
-This accept method only accept the Argument and Dont have return type 
- ForEach method that forEach method   Accept the Consumer Functional Interface
*/
public class ConsumerDemo {
	public static void main(String[] args) {

		Consumer<Integer> consumer = (t) -> { System.out.println("print :" + t); };
		
		consumer.accept(10);
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		list.stream().forEach(t -> System.out.println("Print: :"+ t));
	}
}
