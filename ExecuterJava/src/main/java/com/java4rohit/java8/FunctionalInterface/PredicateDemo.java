package com.java4rohit.java8.FunctionalInterface;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/*
 * Filter Mathod use Predicate it using Conditional check
 * 
 * */
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0) {
				return true;
			}
			return false;

		};

		System.out.println(predicate.test(7));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
Set<Integer> set = new HashSet<>();
		list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Print: :" + t));
	}
}
