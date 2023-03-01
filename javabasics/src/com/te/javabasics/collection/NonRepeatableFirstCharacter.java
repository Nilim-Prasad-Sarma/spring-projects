package com.te.javabasics.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatableFirstCharacter {
	public Character firstNonRepeatableCharacter(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (Character ch : str.toCharArray()) {
			map.put(ch, (map.containsKey(ch)) ? map.get(ch) + 1 : 1);
		}

		return map.entrySet().stream().filter(p -> p.getValue() == 1).findFirst().get().getKey();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string = scanner.next();
		NonRepeatableFirstCharacter apiDemo = new NonRepeatableFirstCharacter();
		System.out.println(apiDemo.firstNonRepeatableCharacter(string));

	}
}
