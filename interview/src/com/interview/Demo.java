package com.interview;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 1920; i <= 3000; i++) {
			arrayList.add(i);
		}
		int rem = 0;
		int count = 0;

		for (Integer integer : arrayList) {
			Integer temp = integer;
			while (temp != 0) {
				rem = temp % 10;
				if (rem != 1 && rem % 2 == 0) {
					System.out.print(integer + ",");
					count = count + 1;
					break;
				}
				temp = temp / 10;
				if (count >= 1) {
					break;
				}
			}
			count = 0;
		}
	}
}
