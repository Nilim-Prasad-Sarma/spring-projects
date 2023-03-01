package com.te.javabasics.java8features;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringNoOfOccurences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.next().toLowerCase();

		/*
		 * converting string to a IntStream Object because we need IntStream to get a
		 * Stream object
		 */
//		IntStream chars = string.chars();
//
//		/* converting IntStream object to a Stream object */
//		Stream<Object> stream = chars.mapToObj(c -> (char) c);
//
//		Map<Object, Long> name = stream.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//		name.forEach((k, v) -> {
//			if (v > 1) {
//				System.out.println(k + ": " + v);
//				System.out.println(stream);
//			}
//		});

		/* Same thing could be done in a single line */
		string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(p -> p, Collectors.counting()))
				.forEach((k, v) -> {
					if (v > 1) {
						System.out.println(k + ": " + v);
					}
				});

	}
}
