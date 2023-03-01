package com.te.javabasics.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();

//		arrayList.add(10);
//		arrayList.add(20);
		

		System.out.println(arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("-----------------------");

		for (Object object : arrayList) {
			System.out.println(object);
		}

		System.out.println("-----------------------");

		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
