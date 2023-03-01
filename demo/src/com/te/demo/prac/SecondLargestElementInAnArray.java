package com.te.demo.prac;

public class SecondLargestElementInAnArray {
	public static void main(String[] args) {
		String str = "aabbccd";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					count = count + 1;
					break;
				}
			}
			if (count == 0) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
