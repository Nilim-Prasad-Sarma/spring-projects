package com.te.demo;

public class NonRepeatingChar {
	public static void main(String[] args) {
		String input = "abcdde";
		for (int i = 0; i < input.length(); i++) {
			boolean b = true;
			for (int j = 0; j < input.length(); j++) {
				if (i != j && input.charAt(i) == input.charAt(j)) {
					b = false;
					break;
				}
			}
			if (b) {
				System.out.println(input.charAt(i));
				break;
			}
		}
	}
}
