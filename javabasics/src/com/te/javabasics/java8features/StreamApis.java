package com.te.javabasics.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApis {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 13, 10, 16, 17, 23);

		List<Integer> listEven = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(listEven);

	}
}
