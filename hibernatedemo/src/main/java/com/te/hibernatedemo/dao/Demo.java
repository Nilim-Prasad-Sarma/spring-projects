package com.te.hibernatedemo.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		String name = "Nilim";
		Map<Character, Long> collect = name.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(collect);

		List<Character> list = collect.entrySet().stream().filter(e -> e.getValue() >= 2).map(e -> e.getKey())
				.collect(Collectors.toList());
		System.out.println(list + " is duplicate");
	}
}
